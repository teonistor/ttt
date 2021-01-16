package io.github.teonistor.adventofcode

import scala.collection.LinearSeq
import scala.collection.immutable.Queue
import scala.util.matching.Regex.Match

object _18 {

  private val lex = "(\\d+)|([+*])|(\\()|(\\))".r

  private def tokenise(mtch: Match) =
    (mtch.group(1), mtch.group(2), mtch.group(3), mtch.group(4)) match {
      case (v, null, null, null) => (1, v)
      case (null, v, null, null) => (2, v)
      case (null, null, v, null) => (3, v)
      case (null, null, null, v) => (4, v)
    }

  private def computeIf(lhs: Long, op: Char, rhs: Long) =
    op match {
      case '+' => lhs + rhs
      case '*' => lhs * rhs
      case _ => rhs
    }

  private def parseLineRec(number: Long, op: Char, remaining: LinearSeq[Match]): (Long, LinearSeq[Match]) = {
    if (remaining.isEmpty) {
      (number, remaining)

    } else {
      val next = tokenise(remaining.head)

      next match {
        case (1, newNumber) => parseLineRec(computeIf(number, op, newNumber.toLong), op, remaining.tail)
        case (2, newOp) => parseLineRec(number, newOp(0), remaining.tail)
        case (3, _) =>
          val parenResult = parseLineLaunch(remaining.tail)
          parseLineRec(computeIf(number, op, parenResult._1), op, parenResult._2)
        case (4, _) => (number, remaining.tail)

      }
    }
  }

  private def parseLineLaunch(remaining: LinearSeq[Match]) = {
    val result = parseLineRec(0, '.', remaining)
    println(s"$remaining => $result")
    result
  }

  private def parseLine(line: String) = {
    val dbg = parseLineLaunch(lex.findAllMatchIn(line).to(List))
    println(s"$line = $dbg")
    dbg._1
  }

  private def computeIf(val1: Long, op1: Char, val2: Long, op2: Char, val3: Long): (Long, Char, Long)  = {
    val vvv = (op1, op2) match {
      case ('+', _) => (val1 + val2, op2, val3)
      case (_, '+') => (val1, op1, val2 + val3)
      case ('*', _) => (val1 * val2, op2, val3)
      case (_, '*') => (val1, op1, val2 * val3)
      case _ => /* I should know which one it is :| */ (LazyList(val1, val2, val3).find(_ != -1L).get, '.', -1L)
    }
    println(s"vvv ($val1 $op1 $val2 $op2 $val3) => $vvv")
    vvv
  }

  private def parseLineRec5(val1: Long, op1: Char, val2: Long, op2: Char, remaining: LinearSeq[Match]): (Long, LinearSeq[Match]) = {
    if (remaining.isEmpty) {
      (computeIf(val1, op1, val2, '.', -1)._1, remaining)

    } else {
      val next = tokenise(remaining.head)

      next match {
        case (1, newNumber) =>
          val (newVal1, newOp1, newVal2) = if (val2 == -1) computeIf(val1, op1, newNumber.toLong, op2, -1)
                                           else computeIf(val1, op1, val2, op2, newNumber.toLong)
          parseLineRec5(newVal1, newOp1, newVal2, op2, remaining.tail)

        case (2, newOp) => if (op1 == '.') parseLineRec5(val1, newOp(0), val2, op2, remaining.tail)
                           else parseLineRec5(val1, op1, val2, newOp(0), remaining.tail)
        case (3, _) =>
          val parenResult = parseLineLaunch5(remaining.tail)
          val (newVal1, newOp1, newVal2) = computeIf(val1, op1, val2, op2, parenResult._1)
          parseLineRec5(newVal1, newOp1, newVal2, op2, parenResult._2)

        case (4, _) => (computeIf(val1, op1, val2, '.', -1)._1, remaining.tail)
      }
    }
  }

  private def parseLineLaunch5(remaining: LinearSeq[Match]) = {
    val result = parseLineRec5(-1, '.', -1, '.', remaining)
    println(s"$remaining => $result")
    result
  }

//  private def solveAnotherWay(present: Queue[(Int, String)]):Long= {
//    present match {
//      case Queue(val1)=>val1._2.toLong
//      case Queue(val1, op, val2)=>computeIf(val1._2.toLong, op._2(0), val2._2.toLong)
//      case Queue(val1, op1, val2, op2, val3, rest*)=>
//        val (newVal1, newOp, newVal2) = computeIf(val1._2.toLong, op1._2(0), val2._2.toLong, op2._2(0), val3._2.toLong)
//        rest
//
//    }
//  }

  private def solveAnotherWay(present: Queue[(Int, String)]):Long= {
    present.size match {
      case 1 => present.head._2.toLong
      case 3 => computeIf(present.head._2.toLong, present.tail.head._2(0), present.tail.tail.head._2.toLong)
//      case 5 => computeIf(present.head._2.toLong, present.tail.head._2(0), present.tail.tail.head._2.toLong, present.tail.tail.tail.head._2(0), present.tail.tail.tail.tail.head._2.toLong)
      case x:Int if x>4 =>
        val (newVal1, newOp, newVal2) = computeIf(present.head._2.toLong, present.tail.head._2(0), present.drop(2).head._2.toLong, present.drop(3).head._2(0), present.drop(4).head._2.toLong)
        // TODO Get rid of these conversions
        solveAnotherWay(present.drop(5).prepended((1, newVal2.toString)).prepended((2, newOp.toString)).prepended((1, newVal1.toString)))
    }
  }

  private def makeQueue(past: Queue[(Int, String)], next: LinearSeq[Match]): (Long, LinearSeq[Match]) =
    if (next.isEmpty)
      (solveAnotherWay(past), next)
    else {
      val w = tokenise(next.head)
      w match {
        case (3, _) => val (parenVal, remainingNext) = newBeginning(next.tail)
          makeQueue(past.appended((1, parenVal.toString)), remainingNext)
        case (4, _) => (solveAnotherWay(past), next.tail)
        case other => makeQueue(past.appended(other), next.tail)
      }
    }

  private def newBeginning(next: LinearSeq[Match])=
    makeQueue(Queue.empty, next)

  private def parseLine5(line: String) = {
    val dbg = newBeginning(lex.findAllMatchIn(line).to(List))
    println(s"$line = $dbg")
    dbg._1
  }

  def _1(input: String): Long = {
    input.split('\n').to(LazyList)
      .map(parseLine)
      .sum
  }

  def _2(input: String): Long = {
    input.split('\n').to(LazyList)
      .map(parseLine5)
      .sum
  }
}

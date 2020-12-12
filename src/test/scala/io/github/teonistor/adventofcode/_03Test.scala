package io.github.teonistor.adventofcode

class _03Test extends AdventOfCodeTestBase {
  testAndRun(3, _03._1, _03._2,
    "..##.......\n#...#...#..\n.#....#..#.\n..#.#...#.#\n.#...##..#.\n..#.##.....\n.#.#.#....#\n.#........#\n#.##...#...\n#...##....#\n.#..#...#.#",
    7L,
    336L,
    "...#...#....#....##...###....#.\n#.#...#...#....#.........#..#..\n.#....##..#.#..##..##..........\n.....#.#.............#..#......\n.......#...#.##.#......#..#.#..\n#.#....#......##........##.....\n.....##.#....#..#...#...##...#.\n...#...#..#.......#..#...##...#\n..........#...........##.......\n..#..#..#...................#..\n#..#....#.....##.#.#..........#\n.#.##.......###.....#.#...#....\n.#..##....##....#.......#...###\n#.#..##...#.#..#...............\n.........#....#.......##.#.#...\n...###...##....##...#..##.#..#.\n....#.........#..#...#.......#.\n....................#..#.#.#...\n..#....#..........#...........#\n.#.....#..#.....##........##..#\n#..##..#...##............#..##.\n.#..##....#..........#..#.##.#.\n..#####..#.#............##.....\n...###.#....##..#.#....#.....#.\n.#.......##....#...#.#.....##..\n...#....#...##.#...#..#........\n.####.....#....#.#.#...#.......\n...#....#.....#.......#........\n#..#.#.......#...#............#\n...#.....###.##....#.#.###.#...\n.#.........#.......#.#....##...\n#.#..#...#.#...##......#..#....\n.....#...#..#.#...#..###..#....\n......#.........#...###........\n.....#..##...#..........#.....#\n..#..#.#.##.#...#....#....##..#\n##....#.##...#.##.#..##....#...\n.....#.#.#.#..#....##.#...#.#..\n.....##.......#........#.......\n...#.#.....#...#...##.#......##\n........#..#.#...#.#.....#.#..#\n#..##...#.#...##..##...#.#...##\n.##.#.#..#...#.....#.#.##.#...#\n.#.####.........##.........#..#\n.##..............#....#...#...#\n......#...#..#...#..#..###.#...\n.......##...#.#.#..##..#......#\n.....#....#..##..#.........#...\n.....#..#.#.#........#.#.####..\n#..#.......###....##...........\n#..##..........#.#......#.#....\n.....##........#...#..##.......\n###...#.##.#.#.#.#.##...##.....\n....#...#........##.#.##..##...\n.#..#.#.#......#.......##..#..#\n.#...#.................#....#..\n.##..#..........#..##.......#..\n.#.#.#.....#..#.#.........##..#\n...#......##...#.......#...##..\n##...###....#.###.............#\n#.....#.#..#.#..#........#.#.#.\n.....#.#......##..#.#.....#.##.\n.......#...........#..#.......#\n..#....#.#.#......#.....#...#..\n.....##........#..##..#..##....\n#.#........#...##....#.#..##...\n#......#......#....#..#...#.##.\n....#.#.......#.#.#............\n......####.#.##...#.#.##.....##\n..###.#.#..#.........#.####....\n.#.......#..#.#....#.#..#.#.##.\n#....#....#............##...##.\n....#....#............#....#..#\n..#........#..#....#..#..#...#.\n.#......##....#..........#....#\n#.##.....#..........#.###.#....\n....##...#.....#.#......#.##...\n#.#.....#.......###.###..#..#.#\n..###..##.............#.####.##\n#....#.....#....#..##.......#..\n.....#....#...#.#.#.#..#...#.##\n...#.....#..#....###......#.#.#\n##.........#.#..#..#.#..#.....#\n.#.....#.#....#.........##..#.#\n.#.#..#.###..#..#..........#...\n.##....#.#.#...#......##.....#.\n#.#....#....#...#...##...#..#..\n#...#........#....#....#......#\n#......#...#..#.#.##.....##..#.\n....#...#......##...#..#....#..\n.#......##.##.......#.......#..\n.#...#..####...........#.#.#...\n.........#...#.#.........#.....\n#.##.....#.#..#.#.###...###..#.\n#...##.###......#.###..##.#.##.\n...##.#.....#....#..#......#...\n#....###.#..#...##.....#......#\n........###...#...#............\n........#....#...#...#....#...#\n#....#..#..#....#.#........#.#.\n##...#.....#.#..........#..#..#\n#.#...##.....#........#...#...#\n##.#.#.......#...#..#.###....#.\n.#.......#....##..##...#.....#.\n#....#....#.....#.......#......\n.##.##.##...##...#.#.#..#..#...\n#..#..#.##....#......##....###.\n.......#.#.........#..##.#...##\n.#..##...#....#.....#..........\n..#.#...#......#.#..#..........\n.##....#.#.#.##.......###...#..\n..##.#...#.#.#.#.......#..#....\n#..#.......#...#........#.....#\n.....#.......#......###..#.....\n...##.#.......#.....##.....##..\n##..#.......#.#.....#....#.....\n..#....#.##.##...#...#......#..\n.#..#.###.#....###........#...#\n....##.##...##..#..#.#....#....\n..###...##.....##..............\n#....#...##...#....#..........#\n.##........#......##...##...#.#\n..#.#.##..........#......#.....\n...#...#.........#.##........##\n..#.#..#.#..#...#....#...#.....\n...##...#..#.###.#..#.#...#....\n....###........#..#..##...#....\n#.#....##.......#.#........#...\n.###...#..#.#.#.#..#...#..##.##\n..#.........#####.#......#..#..\n#.....#.....##..#....#...#...#.\n...#..#....##....##.....##.#...\n.........#............#.##.....\n....##.#..#....#.##.......#..##\n.###....#.#..#......#.#.......#\n.###...###.#.........#.#..#...#\n.....#........#..#.#..#.#..##.#\n.###..#....##.........#..##....\n..#.......#..#..##...#.###.#...\n#.......#...........#.#...#.###\n#.##.##...##.#...##..#.....#...\n..#..#........###.#.....##.....\n#.....##....#...##...####..#..#\n....#........#...#...#.........\n......#.#.#.#.......#..#.....##\n..#..#....#.....#.#...##......#\n..#....#...#.###.........#.###.\n...#......##..#.#.....#...#....\n...#.......#...#...#........##.\n............#...#..#....#.....#\n....##......................#..\n#.#.#....#....#..........##....\n#.#.....#.#.##..#...#.##....##.\n...#...#..#...#..#.#.#.......#.\n#.....#..........#.........##.#\n#...##..#..#.#.......###....#..\n.#...#..##....#.....##.......#.\n....#.##.....#.........#.#....#\n........#.#...####..#.......#.#\n.####...#.#......####.....#.##.\n###..#....#..#.......#.#..##..#\n#......#.#....##..#.##.#....#.#\n...###...#...#..##.#..#..#.#...\n...##..##....#..#.....#........\n.....#..............#......#..#\n......#....#......#..#.........\n#..#.....#.##...........##.....\n.#..#.#..................##....\n#.#..#..##...#....#.#......#...\n.##.#.##......#.##...#...#...#.\n..#...#.........#.#..#.#....#..\n.#.####.#..#.#......##.#..#....\n#..#.......#....#..............\n....#............#..#..........\n.....#####.....#.....#..##...##\n#.#....#.#...............#..##.\n.#.#..#...#......#.....#.#.#...\n.#....#.#.#......#.....##....#.\n....#....#.##..#.......###...##\n.....#..#.##...#...#...#..#.#..\n##..#........#.#..#..##......#.\n.#..#..##.......#..#.....#.....\n.#.#.....###..##.#.#...........\n..##..##.####..........#..#....\n..##..#..#...#....#......#.#...\n#...#.#......##.....##.#..###..\n#..#..............#........##.#\n.........#.##..#.#..#..##.##.#.\n#....##....#.#..#.#...##..#....\n.#....#.......#............##..\n.......#.#.......#...#.#......#\n......##...#.......#.#........#\n..###..#.#.##....##...#....##..\n..##.##..........##..###.......\n.#.#.#..#..#.#.......#.#...##..\n..#..##.........#.###..#......#\n....#.#.#...##.#...#...##..###.\n..###..##.........##...#...#..#\n.#..##...#.......#.......#..#.#\n........##....##....#.#.###.#.#\n#.....#.#.................#.#..\n....#.#.#.....##.####.#......#.\n....#.......#.#.##.##..........\n...#...........#...#.##...#.###\n#....#....#..........#.##......\n##..#...........##.....##.##...\n.#.##...##..##....#..#.....####\n#...#...#.##..........##..##...\n....##..#....#.....#.#...#....#\n..#....#..##...###.#.#.........\n#......#.#.#...#...#.........#.\n#............###.#.#.#..##...#.\n.##.....####...##..##..#..##.#.\n#..#........#.....#.#.....#...#\n#............#....#.#.#........\n......##...##.#....#.....#...#.\n..#........##......#.#.....##..\n.#..#..#.....##.......#..#.#..#\n.#....#..#....##.#.#.#..#..#.##\n.####.#..........#...#..##.....\n...###..###...##..#............\n#..#.....##.#...#..##..#.......\n.....##....#...###.##...#......\n...##..#...#..#..##....##....#.\n...###....#.###.#.#.##....#....\n##.#.#.....#....#.#....#..#....\n.......##.....#.#..##...##...#.\n.#....#.#...##.#..#....#.....#.\n..#...#..#...#.##........#...#.\n#....#......##.#....##...#.#..#\n.....#..#..#..#......#...#.#.#.\n..###....#........#...#.......#\n###...#.......#.#.......##.##..\n......##.....#.#........#....#.\n#.##..#.#.#.#..#....#.##.....#.\n..........#.##.#...#...#..#..#.\n..#...##.#..........#..##.###..\n..###..##.##..#.#...##.####..#.\n#.#.#...............##....###.#\n....#.........#.#....#.#....#.#\n..#...#.###...#....###.....#...\n..#..#....#...#............#...\n.#..#....#..##.....##..........\n..#....#.#...#.#.#.#.......##.#\n.........#....##........#.#....\n...#..##.#..#.##...#...#.#....#\n....####...#...####.#....###..#\n......##...#.##.#.......#..#...\n#.#...#.#...#.#...#....#.#.#...\n.#.....##...#.....###.#....#...\n......##.....###...#.#...#.#...\n#..#..##.#.#......#....#..#..#.\n....#.###.....#..#...#.##.....#\n##.##........#......#....#..##.\n##.....##.#.....#.....##.....#.\n.....#.##...#.#..#.#.#.....#...\n.#.##..#...#.#..#.....#.#......\n.....##.......#..#...##..#..#..\n#.....#..#.####......#........#\n.#..#..##.#..##............#..#\n.##..#.#....##.##.....#......#.\n.......##.........#..#.........\n.#...#.......................#.\n#......#.#....##.#.......#..#..\n..##..##......#.......#....#.#.\n##......#......##...##.........\n..#....####....#.#.....##.#.#..\n..........#..#.#.#.....#..#.#..\n##..##...........##.......#....\n##....#.#....#..#......###....#\n...#.#.#..#.......##.......#...\n#....#.......#.......#.........\n...##......##....#...#......#.#\n#......#####.#.........#.....#.\n#..#.............#..#....#...#.\n.......#.##..#..#..#..#....####\n......#.##..##..........###...#\n.#.##....###..#........#....##.\n#......#..#...###.#...#.....#..\n.#.#.......#....##.......#.#...\n..#.##..#..##.....#.........#.#\n#.#...#..#.##....#.......##....\n.#.....###....#.#..#...#.....#.\n#...#..#.......#.#.....##...#.#\n#.#####.........#....##.....#..\n#....#..##...#....#.##.......#.\n.#.#.........##....##....#.....\n...#..##.......#....#.#.#......\n#.###.##...###....#.....#.####.\n.#...#.#.#..##.#..........#....\n#.#.....#.##.#..####.....##.#..\n...###.##..####.......#......##\n.##..#.........#...#.#.....#.##\n..#.....##....###.....#.#...##.\n#....#....#..#....#.##.........\n......###....#.#..#..#....##...\n.#.#................#.......##.\n...#.......#.........#.#.......\n...#..........#...##.....###...\n....#......#...#...............\n.##...#....#.....#.##......#...\n.#.....###...##..##...#.#......\n....##........#.....#...#....#.\n#.........#.#...##...#.#..#....\n...#.#.....#.#........#.#....#.\n.#........#.....#.#.#.#.#..#...\n....#...#.....#.#....#........#\n..###.#....#.#....##...##..#.##\n.#....#.#.####.#.#.....#.......\n.#...#...#.................##.#\n..................##..#..#.#.#.\n.#..#............##....###.....\n.......#....#...........#......\n....#.#.#.....###.........#..##\n...#.#....#.#.##.#.##.....##..#\n.#.##.#...##...#.......#.....##\n.#............#...#..##...#.#.#\n#.##..#.##..#..##.###.#........\n..............##....#...#..#.#.\n.#.#...#.#....#....###........#\n.#....#.#....#......###........\n..#.......##......#.##.....#...\n.....#......#..#...#.#.....#..."
  )
}

//var stompClient = null;

//function setConnected(connected) {
//    document.getElementById('connect').disabled = connected;
//    document.getElementById('disconnect').disabled = !connected;
//    document.getElementById('conversationDiv').style.visibility
//      = connected ? 'visible' : 'hidden';
//    document.getElementById('response').innerHTML = '';
//}

//function connect() {
//    var socket = new SockJS('/chat');
//    stompClient = Stomp.over(socket);
//    stompClient.connect({}, function(frame) {
//        setConnected(true);
//        console.log('Connected: ' + frame);
//        stompClient.subscribe('/topic/messages', function(messageOutput) {
//            showMessageOutput(JSON.parse(messageOutput.body));
//        });
//    });
//}

//function disconnect() {
//    if(stompClient != null) {
//        stompClient.disconnect();
//    }
//    setConnected(false);
//    console.log("Disconnected");
//}

//function sendMessage() {
//    var from = document.getElementById('from').value;
//    var text = document.getElementById('text').value;
//    stompClient.send("/app/chat", {},
//      JSON.stringify({'from':from, 'text':text}));
//}

//function sendMessage() {
//    stompClient.send("/app/chat", {},
//      JSON.stringify([1, 7, 14, 3]));
//}

//function showMessageOutput(messageOutput) {
//    var response = document.getElementById('response');
//    var p = document.createElement('p');
//    p.style.wordWrap = 'break-word';
//    p.appendChild(document.createTextNode(messageOutput.from + ": "
//      + messageOutput.text + " (" + messageOutput.time + ")"));
//    response.appendChild(p);
//}


new Vue({
  el: '#app',
  data: () => ({
    stompClient: null,

    rows: ["     ","     ","     ","     ","     "]
  }),

  methods: {

    connect () {
      let socket = new SockJS('/ttt-subscribe');
      this.stompClient = Stomp.over(socket);
      this.stompClient.connect({}, frame => {
//          setConnected(true);
        console.log('Connected: ' + frame);
        this.stompClient.subscribe('/ttt/board', this.receive);
      });
    },

    receive (message) {
      console.log("Message: ", message)
      // message.body ...

    },

    send (i, j) {
      console.log(i, j)
      this.stompClient.send("/ttt/click", {}, JSON.stringify([i, j]));
    }
  },

  mounted () {
    this.connect();
  }
});
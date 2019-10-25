const EventEmitter = require('events');

const myEvent = new EventEmitter();
myEvent.on('event1', () => {  // on() : 이벤트 등록
    console.log('event1');
});
myEvent.on('event2', () => {
    console.log('event2 (1)');
});
myEvent.on('event2', () => {
    console.log('event2 (2)');
});
myEvent.emit('event1');  // emit() : 이벤트 호출
myEvent.emit('event2');

myEvent.once('event3', () => {  // once() : 이벤트 등록 후 한 번만 호출 가능
    console.log('event3');
});

for(let i = 0; i < 5; i++) {
    myEvent.emit('event3');  // 한 번만 호출됨
}

// myEvent.removeListener(이벤트, 리스너);  // 특정 이벤트 삭제
myEvent.removeAllListeners('event2');  // 이벤트 삭제
myEvent.emit('event2');
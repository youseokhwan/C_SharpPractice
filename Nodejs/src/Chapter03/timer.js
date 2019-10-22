const timeout = setTimeout(() => {
    console.log('1.5초 후 한 번만 실행');
}, 1500);

const interval = setInterval(() => {
    console.log('1초마다 실행');
}, 1000);

const timeout2 = setTimeout(() => {
    console.log('곧바로 취소');
}, 3000);

setTimeout(() => {
    clearTimeout(timeout2);
}, 500);

const immediate = setImmediate(() => {
    console.log('즉시 실행');
});

// setTimeout(callback, 0)은 실행 시간 예측을 보장할 수 없다.
// setImmediate(callback)을 사용하도록 한다.


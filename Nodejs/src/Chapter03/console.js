const number = 1;
const string = 'abc';
const object = {
    a: 'a',
    b: 'b'
};

console.time('시간 측정');

console.log('텍스트');
console.log(number);
console.log(string);

console.dir(object);

console.timeEnd('시간 측정');
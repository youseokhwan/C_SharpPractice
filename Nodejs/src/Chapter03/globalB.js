const A = require('./globalA');

global.message = '안녕하세요';
console.log(A());

// global에 저장하면 편하게 값을 전달할 수 있지만 남용하면 유지보수가 어려움
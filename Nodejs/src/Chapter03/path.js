const path = require('path');

console.log('path.sep:', path.sep); // 경로의 구분자. Windows는 ₩, POSIX는 /
console.log('path.delimiter:', path.delimiter); // 환경 변수의 구분자. Windows는 ;, POSIX는 :

console.log('-----');
console.log('path.dirname(__filename):', path.dirname(__filename)); // 파일이 위치한 디렉토리의 경로
console.log('path.extname(__filename):', path.extname(__filename)); // 파일의 확장자
console.log('path.basename(__filename):', path.basename(__filename)); // 파일의 이름 + 확장자
console.log('path.basename(__filename, path.extname(__filename)):', path.basename(__filename, path.extname(__filename))); // 파일의 이름만

console.log('-----');
console.log('path.parse(__filename):', path.parse(__filename)); // 파일 경로를 split
console.log('path.format(__filename):', path.format({
    dir: '/Users/youseokhwan/github/today-i-learned/Nodejs/src/Chapter03',
    name: 'path',
    ext: '.js'
})); // parse한 객체를 경로로 합침
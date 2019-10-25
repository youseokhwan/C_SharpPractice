const fs = require('fs');

fs.writeFile('./temp/writeme.txt', 'Bye, NodeJS!', (err) => {
    if(err) {
        throw err;
    }
});

// 동기, 비동기 : 함수가 바로 return 되는지 여부
// 블로킹, 논블로킹 : 백그라운드 작업 완료 여부

// 대부분은 동기-블로킹과 비동기-논블로킹 방식
// 동기-블로킹 : 백그라운드 작업 여부를 계속 확인하며, 호출한 함수가 바로 return되지 않음
// 비동기-논블로킹 : 호출한 함수가 바로 return되고 다음 작업으로 넘어가며, 백그라운드 작업 완료 여부는 신경쓰지 않음
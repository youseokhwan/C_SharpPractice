const http = require('http');

const server = http.createServer((req, res) => {
    res.write('<h1>Hello, Server!</h1>');
    res.end('<p>Bye, Server!</p>');
});

server.listen(8080);
server.on('listening', () => {
    console.log('8080번 포트에서 서버 대기 중입니다!');
});
server.on('error', (error) => {
    console.error(error);
});

// 실제로 배포할 때는 80번 포트(HTTP) 혹은 443번 포트(HTTPS)를 사용
const http = require('http');

http.createServer((req, res) => {
    console.log(req.url, req.headers.cookie);
    res.writeHead(200, { 'Set-Cookie' : 'mycookie=testcookie' });
    res.end('Hello, Cookie');
}).listen(8082, () => {
    console.log('8082번 포트 사용중');
});

/*
2xx - 성공 / 200(성공), 201(작성됨)
3xx - 리다이렉션 / 301(영구 이동), 302(임시 이동)
4xx - 요청 오류 / 401(권한 없음), 403(금지됨), 404(찾을 수 없음)
5xx - 서버 오류 / 500(내부 서버 오류), 502(불량 게이트웨이), 503(서비스를 사용할 수 없음)
*/
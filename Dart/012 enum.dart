/*
 * 열거형
 */

enum Status { login, logout }

var authStatus = Status.logout;

switch(authStatus) {
  case Status.login:
    print('로그인');
    break;
  case Status.logout:
    print('로그아웃');
    break;
}
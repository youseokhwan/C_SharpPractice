/*
 * 분기, 반복
 */

// if else
String text = 'hello';

if (text is int) {
  print('정수');
} else if (text is double) {
  print('실수');
} else {
  print('정수도 실수도 아님');
}

// 삼항 연산자
var todo = isRainy ? '빨래를 하지 않는다' : '빨래를 한다';

// switch
enum Status { Uninitialized, Authenticated, Authenticating, Unauthenicated }

void main() {
  var status = Status.Authenticated;
  switch (status) {
    case Status.Authenticated:
      print('인증됨');
      break;
    case Status.Authenticating:
      print('인증 처리 중');
      break;
    case Status.Unauthenicated;
      print('미인증');
      break;
    case Status.Uninitialized;
      print('초기화됨');
      break;
  }
}

// for
var items = ['짜장', '라면', '볶음밥'];

for (var i = 0; i < items.length; i++) {
  print(items[i]);
}
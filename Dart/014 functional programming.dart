/*
 * 함수형 프로그래밍
 */

// 일급 객체
void greeting(String text) {
  print(text);
}

void main() {
  var f = greeting; // 함수를 다른 변수에 대입할 수 있음
  f('hello');
}


// 람다식
void something(Function(int i) f) {
  f(10);
}

void main() {
  something((i) => print(i));
}


// forEach
final items = [1, 2, 3, 4, 5];

items.forEach(print);
items.forEach((e) => print(e));


// where : 조건을 필터링하는 함수
items.where((e) => e % 2 == 0).forEach(print); // 2, 4


// map : 반복되는 값을 다른 형태로 변환하는 함수
items.where((e) => e % 2 == 0).map((e) => '숫자 $e').forEach(print);

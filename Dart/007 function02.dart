/*
 * 함수(익명함수, 람다식 등)
 */

// Anonymous Function
(number) {
  return number % 2 == 0;
}

// Lambda
(number) => number % 2 == 0;

// Named Parameter
void something({String name, int age}) {}
void main() {
  something(name: '홍길동', age: 10);
}

// 부분적으로 사용하려면 필수 매개변수를 앞에 둔다
void something(String name, {int age}) {}
void main() {
  something(name: '홍길동', age: 10);
  something(name: '홍길동');
  something(age: 10); // 에러
}

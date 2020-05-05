/*
 * +, -, *는 동일
 * 나누기(/)는 double 반환하고 몫(~/)과 나머지(%)는 int 반환
 * assert()는 계산 결과가 참인지 판단하는 함수
 */

assert(2 + 3 == 5);
assert(5 - 2 == 3);
assert(3 * 5 == 15);
assert(5 / 2 == 2.5);
assert(5 ~/ 2 == 2);
assert(5 % 2 == 1);

assert('hello' + 'world' == 'hello world');

var num = 0;
print(num++);  // 0 출력
// num == 1
print(++num);  // 2 출력
// num == 2

assert(2 == 2);
assert(2 != 3);
assert(3 > 2);
assert(2 < 3);
assert(3 >= 3);
assert(2 <= 3);

print(true && true);
print(true && false);
print(false && false);

int a = 10;
if (a is int) {
  print('정수임');
}
if (a is! String) {
  print('문자열이 아님')
}

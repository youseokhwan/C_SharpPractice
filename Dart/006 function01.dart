/*
 * 함수
 */

int f(int x) {
  return x + 10;
}

void main() {
  var result = f(10);
}

int f(int x, int z) {
  return x + z + 10;
}

String f() {
  return '안녕하세요';
}

void f(int x) {
  print(x);
}

void greeting(String greet) {
  print('hello $greet');
}

// 반환형 타입 추론 가능(위와 같은 함수)
greeting(String greet) {
  print('hello $greet');
}

String _name = '홍길동';
print('${_name.length} 글자');

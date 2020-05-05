/*
 * 다트는 int, double, String, bool을 기본 자료형으로 제공
 * int와 double은 num에 포함
 * String의 경우 '와 " 모두 사용 가능하지만 레퍼런스에선 '가 표준
 * var 변수로 타입 추론 가능
 * 상수는 final 키워드 사용
 */

String name;  // 변수 선언
name = '홍길동';  // 값 할당

bool b = true;  // 참
bool b2 = i < 10;  // i는 10보다 작다
bool b3 = s.isEmpty;

int i = 10;
double d = 10.0;

num a = 10;
num b = 20.0;

int a = 10;
double b = a;  // 에러

String s = 'hello';
s = 'world';

var i = 10;
var d = 10.0;
var s = 'hello';
var s2 = "hello";
var b = true;
var b2 = i < 10;
var b3 = s.isEmpty;

final String name = '홍길동';
name = '임꺽정';  // 에러

// final 사용 시 자료형 생략하고 타입 추론 가능
final name = '홍길동';
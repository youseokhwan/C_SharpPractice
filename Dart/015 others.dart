/*
 * 기타 유용한 기법
 */

// 계단식 표기법 .. 연산자
final items = [1, 2, 3, 4, 5];

var result = items;
result.add(6);
result.remove(2);
print(result);

// .. 연산자를 이용하면 위와 같은 결과
print(items
  ..add(6)
  ..remove(2));


// 컬렉션 if
bool b = true;
print([1, 2, 3, 4, 5, if(b) 6]);


// 컬렉션 for
var li = [1, 2, 3];
var ls = [
  '#0',
  for (var i in li) '#$i'
];
li.forEach(print);


// null 처리
print(name?.length);
print(name?.length ?? 0);

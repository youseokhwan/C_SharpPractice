# Python Review

### Introduction

- 순수 객체지향 언어
- 인터프리터 언어
- REPL(Read, Eval, Print, Loop)

### 범위 연산자

~~~
str = "Hello World"

# str[0] == 'H'
# str[-5] == 'W'
# str[9:11] == 'ld'
# str[:2] == 'He'
# str[-4:-2] == 'or'
~~~

### NULL

- Python은 None 키워드 사용
~~~
a = None
a is None == True
~~~

### Mutable Data Structure

- Lists: [1, 2, 3, 4]
  * del 키워드로 삭제 (del[0])
  * +로 결합, *로 반복
  * append(): 맨 뒤에 원소 추가
  * extend(): 맨 뒤에 list 추가
  * count(): 등장 횟수 리턴
  * index(): 첫 등장 index 리턴
  * insert(): 특정 위치에 원소 추가
  * reverse(): 역순
  * clear(): 리스트 초기화
  * remove(): 첫 번째 등장하는 원소 삭제
  * pop(): 맨 뒤 원소 반환 후 삭제
  * sort(): 정렬
- Dictionaries: {"a": 1, "b": 2}
- Tuples: (1, 2, 3)
  * 튜플은 값 변경 불가능
- Sets
  * 중복 원소 불가능
  * 수학적 집합과 같은 개념

### Iterator

- Iterable: 자기 자신의 원소를 순서대로 반환할 수 있는 객체
- Iterator: 값을 차례대로 꺼낼 수 있는 객체
~~~
my_list = [1, 2, 3]
my_iter = iter(my_list)
my_iter.__next__()
# 1
my_iter.__next__()
# 2
my_iter.__next__()
# 3
~~~

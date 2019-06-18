# Brute-force Search Algorithm(완전 탐색 알고리즘)

- 모든 경우의 수를 순회하면서 정답을 찾는 것을 무식하게 푼다라고 표현
- 입력의 최대 크기가 작은 경우 이 방법이 유용함

### Recursive Function(재귀 함수)

- 자기 자신을 호출하는 함수
- 다양한 알고리즘을 구현하는 데 매우 유용한 도구
- 1부터 n까지의 합을 반환하는 재귀 함수
~~~
int recursiveSum(int n) {
  if(n == 1)  // base case (기저 사례, 재귀 함수에서 반드시 필요)
    return 1;
  
  return n + recursiveSum(n-1);
}
~~~

- 재귀 함수는 항상 2군데 이상에서 실행되기 때문에 base code(기저 사례)를 작성할 때 입력의 범위를 벗어나는 것 등을 처리하는 것도 좋음(입력 범위 밖이면 무조건 false 반환 등)

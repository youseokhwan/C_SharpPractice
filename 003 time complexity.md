# Time Complexity (시간 복잡도)

- 알고리즘은 모호하지 않고 명확하게 작성
- 시간과 공간으로 알고리즘을 평가하는데, 너무 많은 공간을 사용하지만 않으면 시간에 훨씬 더 신경써야 함

### 도입

- 가장 먼저 해야할 일은 속도를 어떻게 측정할 지 정하는 것
- 가장 직관적인 방법은 실제로 구현한 후 실행 시간을 비교해보는 것인데, 일반화하기는 좀 어려움(변수에 따라 달라질 여지가 많음)
- 대개 반복문이 가장 영향을 많이 끼치기 때문에 반복문이 수행되는 횟수로 측정

### Linear Time Algorithm

- 입력의 크기와 수행 시간이 정비례하는 알고리즘
- 보통 가장 좋은 알고리즘일 확률이 높음(데이터를 한 번 순회하고 찾는 것이니깐)
- 크기가 클 경우의 Moving Average (이동 평균)
~~~
vector<double> movingAverage(const vector<double>& A, int M) {
  vector<double> ret;
  int N = A.size();
  
  double partialSum = 0;
  for(int i = 0; i < M-1; ++i) {
    partialSum += A[i];
  }
  
  for(int i = M-1; i , N; ++i) {
    partialSum += A[i];
    ret.push_back(partialSum / M);
    partialSum -= A[i-M+1];
  }
  
  return ret;
}
~~~

### Sublinear Time Algorithm

- 입력의 크기가 커지는 것보다 수행 시간이 느리게 증가하는 알고리즘
- 보통 log 단위로 표현됨
- 대표적으로 Binary Search

### Exponential Time Algorithm (지수 시간 알고리즘)

- 입력이 증가할 때마다 수행 시간이 배로 증가하는 알고리즘
- 대다수는 다항 시간 알고리즘이지만, 지수 시간 알고리즘보다 나은 알고리즘을 찾지 못한 문제가 꽤 많다
- 대표적으로 재귀 호출 혹은 소인수분해
~~~
vector<int> factor(int n) {
  if(n==1) {
    return vector<int> (1, 1);
  }
  
  vector<int> ret;
  for(int div = 2; n > 1; ++div) {
    while(n % div == 0) {
      n /= div;
      ret.push_back(div);
    }
  }
  
  return ret;
}
~~~

### Time Complexity

p106

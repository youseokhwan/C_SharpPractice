#include <iostream>
#include <vector>

int main() {
    bool* prime = new bool[10001];
    prime[1] = false;
    for(int i = 2; i <= 10000; i++)
        prime[i] = true;
    
    for(int i = 2; i*i <= 10000; i++) {
        if(prime[i])
            for(int j = i*2; j <= 10000; j+=i)
                prime[j] = false;
    }
    
    int M, N;
    scanf("%d %d", &M, &N);
    
    std::vector<int> v;
    int sum = 0, min = 10001;
    for(int i = M; i <= N; i++)
        if(prime[i])
            v.push_back(i);
    
    std::vector<int>::iterator iter;
    for(iter = v.begin(); iter != v.end(); iter++) {
        sum += *iter;
        if(*iter < min)
            min = *iter;
    }
    
    if(v.size() == 0)
        printf("-1");
    else
        printf("%d\n%d", sum, min);
    
    delete[] prime;
    
    return 0;
}

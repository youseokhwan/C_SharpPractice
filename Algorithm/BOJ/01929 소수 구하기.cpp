#include <iostream>

int main() {
    int M, N;
    scanf("%d %d", &M, &N);
    
    bool* prime = new bool[N+1];
    prime[1] = false;
    for(int i = 2; i <= N; i++)
        prime[i] = true;
    
    for(int i = 2; i*i <= N; i++) {
        if(prime[i])
            for(int j = i*2; j <= N; j+=i)
                prime[j] = false;
    }
    
    for(int i = M; i <= N; i++)
        if(prime[i])
            printf("%d\n", i);
    
    delete[] prime;
    
    return 0;
}

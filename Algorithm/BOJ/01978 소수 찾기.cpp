#include <iostream>

int main() {
    bool* prime = new bool[1001];
    prime[1] = false;
    for(int i = 2; i <= 1000; i++)
        prime[i] = true;
    
    for(int i = 2; i*i <= 1000; i++)
        if(prime[i])
            for(int j = i*2; j <= 1000; j+=i)
                prime[j] = false;
    
    int N, count = 0;
    scanf("%d", &N);
    
    for(int i = 0; i < N; i++) {
        int num;
        scanf("%d", &num);
        
        if(prime[num])
            count++;
    }
    
    printf("%d", count);
    
    delete[] prime;
    
    return 0;
}

#include <iostream>
#include <vector>
#define SIZE 123456*2

int main() {
    bool* prime = new bool[SIZE+1];
    prime[1] = false;
    for(int i = 2; i <= SIZE; i++)
        prime[i] = true;
    
    for(int i = 2; i*i <= SIZE; i++) {
        if(prime[i])
            for(int j = i*2; j <= SIZE; j+=i)
                prime[j] = false;
    }
    
    int n;
    while(true) {
        scanf("%d", &n);
        if(n == 0)
            break;
        
        int count = 0;
        for(int i = n+1; i <= n*2; i++)
            if(prime[i])
                count++;
        
        printf("%d\n", count);
    }
    
    delete[] prime;
    
    return 0;
}

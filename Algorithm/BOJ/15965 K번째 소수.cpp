#include <iostream>
#include <vector>
#define SIZE 7500000

int main() {
    bool* prime = new bool[SIZE+1];
    prime[1] = false;
    for(int i = 2; i <= SIZE; i++)
        prime[i] = true;
    
    for(int i = 2; i*i <= SIZE; i++)
        if(prime[i])
            for(int j = i*2; j <= SIZE; j+=i)
                prime[j] = false;
    
    std::vector<int> v;
    for(int i = 2; i <= SIZE; i++)
        if(prime[i])
            v.push_back(i);
    
    int K;
    scanf("%d", &K);
    
    printf("%d", v.at(K-1));
    
    delete[] prime;
    
    return 0;
}

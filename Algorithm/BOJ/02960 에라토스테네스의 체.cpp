#include <iostream>
#include <vector>

int main() {
    int N, K;
    scanf("%d %d", &N, &K);
    
    std::vector<int> v;
    bool* prime = new bool[N+1];
    prime[1] = false;
    for(int i = 2; i <= N; i++)
        prime[i] = true;
    
    for(int i = 2; i <= N; i++) {
        if(prime[i]) {
            v.push_back(i);
            for(int j = i*2; j <= N; j+=i) {
                if(prime[j])
                    v.push_back(j);
                prime[j] = false;
            }
        }
    }
    
    printf("%d", v.at(K-1));
    
    delete[] prime;
    
    return 0;
}

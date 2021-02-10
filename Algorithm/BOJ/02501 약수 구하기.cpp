#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N, K;
    std::cin >> N >> K;
    
    std::vector<int> v;
    for(int i = 1; i <= N; i++)
        if(N%i == 0)
            v.push_back(i);
    
    if(v.size() < K)
        std::cout << "0";
    else
        std::cout << v.at(K-1);
    
    return 0;
}

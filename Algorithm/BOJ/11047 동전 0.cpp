#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cout.tie(); std::cin.tie();
    
    int N, K;
    std::cin >> N >> K;
    
    std::vector<int> v;
    for(int i = 0; i < N; i++) {
        int A;
        std::cin >> A;
        
        v.push_back(A);
    }
    
    int count = 0;
    for(int i = N-1; i >= 0, K > 0; i--) {
        count += (K / v.at(i));
        K %= v.at(i);
    }
    
    std::cout << count;
    
    return 0;
}

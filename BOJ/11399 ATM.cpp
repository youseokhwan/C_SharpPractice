#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cout.tie(); std::cin.tie();
    
    int N;
    std::cin >> N;
    
    std::vector<int> v(N);
    for(int i = 0; i < N; i++)
        std::cin >> v.at(i);
    
    std::sort(v.begin(), v.end());
    
    int sum = 0;
    for(int i = 0; i < N; i++)
        sum += v.at(i)*(N-i);
    
    std::cout << sum;
    
    return 0;
}

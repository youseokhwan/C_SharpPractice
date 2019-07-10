// 2839 설탕 배달 문제

#include <iostream>
#include <vector>
#define INF 1000000

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cout.tie(); std::cin.tie();
    
    int N;
    std::cin >> N;
    
    std::vector<int> v;
    v.push_back(0);
    for(int i = 1; i <= N; i++)
        v.push_back(INF);
    
    for(int i = 1; i <= N; i++) {
        if(5 <= i && v.at(i-5)+1 < v.at(i))
            v.at(i) = v.at(i-5)+1;
        
        if(3 <= i && v.at(i-3)+1 < v.at(i))
            v.at(i) = v.at(i-3)+1;
    }
    
    if(v.at(N) == INF)
        std::cout << "-1";
    else
        std::cout << v.at(N);
    
    return 0;
}

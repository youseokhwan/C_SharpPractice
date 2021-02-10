#include <iostream>
#include <string>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    std::vector<std::string> v(N);
    for(int i = 0; i < N; i++)
        std::cin >> v.at(i);
    
    std::string ans;
    for(int i = 0; i < v.at(0).size(); i++) {
        int count = 1;
        char c = v.at(0).at(i);
        
        for(int j = 1; j < v.size(); j++)
            if(v.at(j).at(i) == c) count++;
        
        if(count == v.size()) ans += c;
        else ans += '?';
    }
    
    std::cout << ans;
    
    return 0;
}

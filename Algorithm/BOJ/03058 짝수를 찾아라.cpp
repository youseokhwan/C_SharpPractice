#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        std::vector<int> v;
        
        for(int j = 0; j < 7; j++) {
            int num;
            std::cin >> num;
            
            if(num%2 == 0)
                v.push_back(num);
        }
        
        int sum = 0, min = 101;
        std::vector<int>::iterator iter;
        for(iter = v.begin(); iter != v.end(); iter++) {
            sum += *iter;
            if(*iter < min)
                min = *iter;
        }
        
        std::cout << sum << " " << min << "\n";
    }
    
    return 0;
}

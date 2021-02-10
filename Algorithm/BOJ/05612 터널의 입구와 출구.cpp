#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int n, m, max = 0;
    std::cin >> n >> m;
    
    for(int i = 0; i < n; i++) {
        int input, output;
        std::cin >> input >> output;
        
        m = m + input - output;
        if(m < 0) {
            std::cout << "0";
            return 0;
        }
        
        if(m > max)
            max = m;
    }
    
    std::cout << max;
    
    return 0;
}

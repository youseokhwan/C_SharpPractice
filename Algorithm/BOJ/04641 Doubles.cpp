#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    while(true) {
        int T;
        std::cin >> T;
        
        if(T == -1)
            break;
        
        std::vector<int> v = {T};
        while(true) {
            int num;
            std::cin >> num;
            
            if(num == 0)
                break;
            
            v.push_back(num);
        }
        
        int count = 0;
        std::vector<int>::iterator iter;
        for(iter = v.begin(); iter != v.end(); iter++) {
            if(std::find(v.begin(), v.end(), (*iter)*2) != v.end())
                count++;
        }
        
        std::cout << count << "\n";
    }
    
    return 0;
}

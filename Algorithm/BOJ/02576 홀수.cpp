#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::vector<int> v;
    for(int i = 0; i < 7; i++) {
        int temp;
        std::cin >> temp;
        
        v.push_back(temp);
    }
    
    int sum = 0, min = 101;
    for(int i = 0; i < 7; i++) {
        if(v.at(i)%2 != 0) {
            sum += v.at(i);
            
            if(v.at(i) < min)
                min = v.at(i);
        }
    }
    
    if(!sum)
        std::cout << "-1";
    else
        std::cout << sum << "\n" << min;
    
    return 0;
}

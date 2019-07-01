#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    std::vector<int> num;
    for(int i = 0; i < N; i++) {
        int temp;
        std::cin >> temp;
        
        num.push_back(temp);
    }
    
    int v, count = 0;
    std::cin >> v;
    std::vector<int>::iterator iter;
    for(iter = num.begin(); iter != num.end(); iter++) {
        if(v == *iter)
            count++;
    }
    
    std::cout << count;
    
    return 0;
}

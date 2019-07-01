#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::vector<int> v;
    for(int i = 0; i < 5; i++) {
        int sum = 0;
        for(int j = 0; j < 4; j++) {
            int score;
            std::cin >> score;
            
            sum += score;
        }
        
        v.push_back(sum);
    }
    
    int maxIndex, maxScore = 0;
    std::vector<int>::iterator iter;
    for(iter = v.begin(); iter != v.end(); iter++) {
        if(*iter > maxScore) {
            maxIndex = iter - v.begin();
            maxScore = *iter;
        }
    }
    
    std::cout << maxIndex+1 << " " << maxScore;
    
    return 0;
}

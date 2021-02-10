#include <iostream>
#include <vector>
#include <algorithm>

bool compare(int A, int B) {
    return A>B;
}

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::vector<int> w, k;
    for(int i = 0; i < 10; i++) {
        int score;
        std::cin >> score;
        
        w.push_back(score);
    }
    
    for(int i = 0; i < 10; i++) {
        int score;
        std::cin >> score;
        
        k.push_back(score);
    }
    
    std::sort(w.begin(), w.end(), compare);
    std::sort(k.begin(), k.end(), compare);
    
    int sumW = 0, sumK = 0;
    for(int i = 0; i < 3; i++) {
        sumW += w.at(i);
        sumK += k.at(i);
    }
    
    std::cout << sumW << " " << sumK;
    
    return 0;
}

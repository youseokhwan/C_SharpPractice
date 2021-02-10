#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    int sum = 0, score = 1;
    for(int i = 0; i < N; i++) {
        int result;
        std::cin >> result;
        
        if(result == 1)
            sum += score++;
        else
            score = 1;
    }
    
    std::cout << sum;
    
    return 0;
}

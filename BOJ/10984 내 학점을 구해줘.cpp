#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        int N;
        std::cin >> N;
        
        int pointSum = 0;
        double scoreSum = 0.0;
        for(int j = 0; j < N; j++) {
            int C;
            double G;
            std::cin >> C >> G;
            
            pointSum += C;
            scoreSum += C*G;
        }
        
        std::cout.setf(std::ios::fixed);
        std::cout.precision(1);
        std::cout << pointSum << " " << scoreSum/pointSum << "\n";
    }
    
    return 0;
    
}

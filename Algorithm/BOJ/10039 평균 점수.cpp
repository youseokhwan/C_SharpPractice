#include <iostream>

int main(int argc, char** argv) {
    int score[5];
    int sum = 0;
    
    for(auto i = 0; i < sizeof(score)/sizeof(int); i++) {
        std::cin >> score[i];
        if(score[i] < 40)
            score[i] = 40;
        sum += score[i];
    }
    
    std::cout << sum/5 << "\n";
    
    return 0;
}

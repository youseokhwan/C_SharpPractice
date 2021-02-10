#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::string grade;
    std::cin >> grade;
    
    double score;
    switch(grade.at(0)) {
        case 'A':
            score += 4.0; break;
        case 'B':
            score += 3.0; break;
        case 'C':
            score += 2.0; break;
        case 'D':
            score += 1.0; break;
        default:
            std::cout << "0.0"; return 0;
    }
    
    switch(grade.at(1)) {
        case '+':
            score += 0.3; break;
        case '-':
            score -= 0.3; break;
    }
    
    printf("%.1lf",  score);
    
    return 0;
}

#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int n;
    std::cin >> n;
    
    int CY = 100, SD = 100;
    for(int i = 0; i < n; i++) {
        int cy, sd;
        std::cin >> cy >> sd;
        
        if(cy > sd)
            SD -= cy;
        else if(cy < sd)
            CY -= sd;
    }
    
    std::cout << CY << "\n" << SD;
    
    return 0;
}

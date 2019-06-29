#include <iostream>
#include <algorithm>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int length[3];
    while(true) {
        std::cin >> length[0] >> length[1] >> length[2];
        if(length[0] == 0 && length[1] == 0 && length[2] == 0) break;
        
        std::sort(length, length+3);
        
        if(length[0]*length[0] + length[1]*length[1] == length[2]*length[2])
            std::cout << "right\n";
        else
            std::cout << "wrong\n";
    }
    
    return 0;
}

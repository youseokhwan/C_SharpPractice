#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int count = 0;
    for(int i = 0; i < 5; i++) {
        std::string name;
        std::cin >> name;
        
        if(name.find("FBI") != std::string::npos) {
            std::cout << i+1 << " ";
            count++;
        }
    }
    
    if(count == 0)
        std::cout << "HE GOT AWAY!";
    
    return 0;
}

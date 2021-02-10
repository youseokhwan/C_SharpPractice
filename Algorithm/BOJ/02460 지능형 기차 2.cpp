#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int people = 0, max = 0;
    for(int i = 0; i < 10; i++) {
        int out, in;
        std::cin >> out >> in;
        
        people += (in - out);
        if(people > max)
            max = people;
    }
    
    std::cout << max;
    
    return 0;
}

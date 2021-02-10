#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int e, f, c;
    std::cin >> e >> f >> c;
    
    int drink = 0, empty = e+f;
    while(true) {
        if(empty / c == 0) break;
        drink += empty/c;
        empty = empty/c + empty%c;
    }
    
    std::cout << drink;
    
    return 0;
}

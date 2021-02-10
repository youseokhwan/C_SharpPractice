#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cout.tie(); std::cin.tie();
    
    int pay;
    std::cin >> pay;
    pay = 1000 - pay;
    
    int n500 = 0, n100 = 0, n50= 0, n10 = 0, n5 = 0, n1 = 0;
    n500 += pay/500; pay %= 500;
    n100 += pay/100; pay %= 100;
    n50 += pay/50; pay %= 50;
    n10 += pay/10; pay %= 10;
    n5 += pay/5; pay %= 5;
    n1 += pay;
    
    int count = n500+n100+n50+n10+n5+n1;
    std::cout << count;
    
    return 0;
}

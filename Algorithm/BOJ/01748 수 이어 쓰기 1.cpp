#include <iostream>

int digit(int num) {
    int ret = 0;
    
    while(num/10 != 0 || num%10 != 0) {
        ret++;
        num /= 10;
    }
    
    return ret;
}

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    int count = 0;
    for(int i = 1; i <= N; i++)
        count += digit(i);
    
    std::cout << count;
    
    return 0;
}

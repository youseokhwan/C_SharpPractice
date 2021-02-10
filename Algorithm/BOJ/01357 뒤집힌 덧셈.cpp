#include <iostream>

int Rev(int n) {
    int ret = 0;
    
    while(n > 0) {
        ret = ret*10 + n%10;
        n /= 10;
    }
    
    return ret;
}

int main() {
    int X, Y;
    scanf("%d %d", &X, &Y);
    
    printf("%d", Rev(Rev(X) + Rev(Y)));
    
    return 0;
}

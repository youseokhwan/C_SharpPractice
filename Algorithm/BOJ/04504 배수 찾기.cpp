#include <iostream>

int main() {
    int n;
    scanf("%d", &n);
    
    while(true) {
        int x;
        scanf("%d", &x);
        
        if(x == 0)
            break;
        
        printf("%d is ", x);
        if(x % n != 0)
            printf("NOT ");
        printf("a multiple of %d.\n", n);
    }
    
    return 0;
}

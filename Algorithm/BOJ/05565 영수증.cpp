#include <iostream>

int main() {
    int sum;
    scanf("%d", &sum);
    
    for(int i = 0; i < 9; i++) {
        int price;
        scanf("%d", &price);
        
        sum -= price;
    }
    
    printf("%d", sum);
    
    return 0;
}

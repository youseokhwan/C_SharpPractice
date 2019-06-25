#include <iostream>

int main() {
    int num[9];
    for(int i = 0; i < 9; i++)
        scanf("%d", &num[i]);
    
    int maxIndex = 0;
    for(int i = 1; i < 9; i++) {
        if(num[i] > num[maxIndex])
            maxIndex = i;
    }
    
    printf("%d\n%d", num[maxIndex], maxIndex+1);
    
    return 0;
}

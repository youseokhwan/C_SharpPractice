#include <iostream>

int main() {
    int A, B, C;
    scanf("%d %d %d", &A, &B, &C);
    
    int count = -1;
    do {
        count++;
        
        int left = B-A;
        int right = C-B;
        
        if(left < right) {
            A = B;
            B = B+1;
        }
        else {
            C = B;
            B = B-1;
        }
    } while(A != B && B != C && C != A);
    
    printf("%d", count);
    
    return 0;
}

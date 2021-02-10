#include <iostream>

int main() {
    int M, ball = 1;
    scanf("%d", &M);
    
    for(int i = 0; i < M; i++) {
        int X, Y;
        scanf("%d %d", &X, &Y);
        
        if(X == ball)
            ball = Y;
        else if(Y == ball)
            ball = X;
    }
    
    printf("%d", ball);
    
    return 0;
}

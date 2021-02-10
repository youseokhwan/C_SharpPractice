#include <iostream>
#include <algorithm>

bool compare(int a, int b) {
    return a>b;
}

int main() {
    int N;
    scanf("%d", &N);
    
    int* A = new int[N];
    int* B = new int[N];
    
    for(int i = 0; i < N; i++) {
        int num;
        scanf("%d", &A[i]);
    }
    
    for(int i = 0; i < N; i++) {
        int num;
        scanf("%d", &B[i]);
    }
    
    std::sort(A, A+N);
    std::sort(B, B+N, compare);
    
    int sum = 0;
    for(int i = 0; i < N; i++)
        sum += A[i]*B[i];
    
    printf("%d", sum);
    
    delete[] A, B;
    
    return 0;
}

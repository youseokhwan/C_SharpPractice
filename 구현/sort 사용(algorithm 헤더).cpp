#include <iostream>
#include <algorithm>
#define SIZE 10

bool desc(int a, int b) {
    return a>b;
}

void print(int data[]) {
    for(int i = 0; i < SIZE; i++)
        printf("%d ", data[i]);
    printf("\n");
}

int main() {
    int data[SIZE] = {7, 3, 4, 1, 8, 9, 2, 0, 5, 6};
    print(data);
    
    std::sort(data, data+SIZE);
    print(data);
    
    std::sort(data, data+SIZE, desc);
    print(data);
}

#include <iostream>
#include <algorithm>
#include <vector>

int main() {
    int N;
    scanf("%d", &N);
    
    std::vector<int> num;
    for(int i = 0; i < N; i++) {
        int temp;
        scanf("%d", &temp);
        num.push_back(temp);
    }
    
    std::sort(num.begin(), num.end());
    for(std::vector<int>::iterator iter = num.begin(); iter != num.end(); iter++) {
        printf("%d\n", *iter);
    }
}

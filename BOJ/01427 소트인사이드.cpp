#include <iostream>
#include <vector>
#include <algorithm>

bool compare(int a, int b) {
    return a>b;
}

int main() {
    int N;
    scanf("%d", &N);
    
    std::vector<int> v;
    while(N > 0) {
        v.push_back(N%10);
        N /= 10;
    }
    
    std::sort(v.begin(), v.end(), compare);
    std::vector<int>::iterator iter;
    for(iter = v.begin(); iter != v.end(); iter++)
        printf("%d", *iter);
    
    return 0;
}

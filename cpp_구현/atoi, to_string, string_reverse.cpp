#include <iostream>
#include <algorithm>

int Rev(int n) {
    std::string temp = std::to_string(n);
    std::reverse(temp.begin(), temp.end());
    
    return atoi(temp.c_str());
}

int main() {
    int X, Y;
    scanf("%d %d", &X, &Y);
    
    printf("%d", Rev(Rev(X) + Rev(Y)));
    
    return 0;
}

#include <iostream>
#include <vector>

int sequence(int n) {
    std::vector<int> v;
    while(n > 0) {
        v.push_back(n%10);
        n/=10;
    }
    
    if(v.size() <= 2) return 1;
    else {
        int diff = v.at(1) - v.at(0);
        for(int i = 2; i < v.size(); i++)
            if(v.at(i) - v.at(i-1) != diff) return 0;
        
        return 1;
    }
}

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    int count = 0;
    for(int i = 1; i <= N; i++)
        count += sequence(i);
    
    std::cout << count;
    
    return 0;
}

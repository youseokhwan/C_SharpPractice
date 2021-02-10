#include <iostream>
#include <vector>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    std::vector<int> s, a;
    for(int i = 0; i < N; i++) {
        int A, B;
        std::cin >> A >> B;
        
        s.push_back(A);
        a.push_back(B);
    }
    
    int sum = 0;
    std::vector<int>::iterator sIter, aIter;
    for(sIter = s.begin(), aIter = a.begin(); sIter != s.end(); sIter++, aIter++) {
        sum += *aIter % *sIter;
    }
    
    std::cout << sum;
    
    return 0;
}

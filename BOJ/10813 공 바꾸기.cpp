#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N, M;
    std::cin >> N >> M;
    
    int* box = new int[N+1];
    for(int i = 0; i <= N; i++)
        box[i] = i;
    
    for(int i = 0; i < M; i++) {
        int a, b;
        std::cin >> a >> b;
        
        box[0] = box[a];
        box[a] = box[b];
        box[b] = box[0];
    }
    
    for(int i = 1; i <= N; i++)
        std::cout << box[i] << " ";
    
    delete[] box;
    
    return 0;
}

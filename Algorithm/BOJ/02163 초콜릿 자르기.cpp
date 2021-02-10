#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N, M;
	std::cin >> N >> M;
	
	std::cout << N*M-1;
		
	return 0;
}
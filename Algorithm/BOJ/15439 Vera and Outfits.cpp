#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	std::cout << N*(N-1);
	
	return 0;
}
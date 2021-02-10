#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	for(int i = 1; i <= N; i++) {
		for(int j = 0; j < N-i; j++)
			std::cout << " ";
		
		for(int j = 0; j < i*2-1; j++)
			std::cout << "*";
		
		std::cout << "\n";
	}
		
	return 0;
}
#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	for(int i = 1; i <= N; i++) {
		for(int j = 1; j <= i; j++)
			std::cout << "*";
		
		for(int j = 1; j <= 2*(N-i); j++)
			std::cout << " ";
		
		for(int j = 1; j <= i; j++)
			std::cout << "*";
		
		std::cout << "\n";
	}
	
	for(int i = 1; i < N; i++) {
		for(int j = 1; j <= N-i; j++)
			std::cout << "*";
		
		for(int j = 1; j <= 2*i; j++)
			std::cout << " ";
		
		for(int j = 1; j <= N-i; j++)
			std::cout << "*";
		
		std::cout << "\n";
	}
		
	return 0;
}
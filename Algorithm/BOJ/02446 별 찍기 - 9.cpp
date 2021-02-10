#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	for(int i = 1; i <= N; i++) {
		for(int j = 1; j <= i-1; j++)
			std::cout << " ";
		
		for(int j = 1; j <= 2*(N-i+1)-1; j++)
			std::cout << "*";
		
		std::cout << "\n";
	}
	
	for(int i = 2; i <= N; i++) {
		for(int j = 1; j <= N-i; j++)
			std::cout << " ";
		
		for(int j = 1; j <= 2*i-1; j++)
			std::cout << "*";
		
		std::cout << "\n";
	}
		
	return 0;
}
#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int fib[41] = {0, 1};
	for(int i = 2; i <= 41; i++)
		fib[i] = fib[i-1] + fib[i-2];
	
	int T;
	std::cin >> T;
	
	for(int i = 0; i < T; i++) {
		int N;
		std::cin >> N;
		
		if(N == 0)
			std::cout << "1 0\n";
		else
			std::cout << fib[N-1] << " " << fib[N] << "\n";
	}
	
	return 0;
}
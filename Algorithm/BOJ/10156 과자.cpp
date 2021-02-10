#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	int K, N, M;
	std::cin >> K >> N >> M;
	
	if(M-K*N >= 0)
		std::cout << "0";
	else
		std::cout << K*N-M;
	
	return 0;
}
#include <iostream>

int Euclid(long long A, long long B) {
	if(B == 0) return A;
	else return Euclid(B, A%B);
}

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int T;
	std::cin >> T;
	
	for(int i = 0; i < T; i++) {
		long long A, B;
		std::cin >> A >> B;

		long long lcm = A*B/Euclid(A, B);
		std::cout << lcm << "\n";
	}
	
	return 0;
}
#include <iostream>

int Euclid(int A, int B) {
	if(B == 0) return A;
	else return Euclid(B, A%B);
}

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int T;
	std::cin >> T;
	
	for(int i = 0; i < T; i++) {
		int A, B;
		std::cin >> A >> B;

		int gcd = Euclid(A, B);
		std::cout << A*B/gcd << "\n";
	}
		
	return 0;
}
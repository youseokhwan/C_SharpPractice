#include <iostream>

int Euclid(int A, int B) {
	if(B == 0) return A;
	else return Euclid(B, A%B);
}

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int A, B;
	std::cin >> A >> B;
	
	int gcd = Euclid(A, B);
	std::cout << gcd << "\n" << A*B/gcd;
	
	return 0;
}
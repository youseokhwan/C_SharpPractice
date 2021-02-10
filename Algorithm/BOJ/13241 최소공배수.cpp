#include <iostream>

int Euclid(long long A, long long B) {
	if(B == 0) return A;
	else return Euclid(B, A%B);
}

int main() {
	std::ios_base::sync_with_stdio(false);
	
	long long A, B;
	std::cin >> A >> B;

	long long lcm = A*B/Euclid(A, B);
	std::cout << lcm;
		
	return 0;
}
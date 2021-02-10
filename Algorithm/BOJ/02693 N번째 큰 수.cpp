#include <iostream>
#include <algorithm>

bool compare(int A, int B) {
	return A>B;
}

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int T;
	std::cin >> T;
	
	for(int i = 0; i < T; i++) {
		int A[10];
		for(int j = 0; j < 10; j++)
			std::cin >> A[j];
		
		std::sort(A, A+10, compare);
		
		std::cout << A[2] << "\n";
	}
	
	return 0;
}
#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	int N;
	std::cin >> N;
	
	int AWin = 0, BWin = 0;
	
	for(int i = 0; i < N; i++) {
		int A, B;
		std::cin >> A >> B;
		
		if(A > B) AWin++;
		else if(B > A) BWin++;
	}
	
	std::cout << AWin << " " << BWin;
	
	return 0;
}
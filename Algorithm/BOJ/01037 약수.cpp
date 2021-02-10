#include <iostream>
#include <algorithm>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	int* div = new int[N];
	
	for(int i = 0; i < N; i++) {
		int num;
		std::cin >> num;
		
		div[i] = num;
	}
	
	std::sort(div, div+N);
	
	if(N%2 == 0)
		std::cout << div[N/2-1]*div[N/2];
	else
		std::cout << div[N/2]*div[N/2];
	
	delete[] div;
	
	return 0;
}
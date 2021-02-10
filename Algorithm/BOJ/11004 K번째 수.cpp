#include <iostream>
#include <vector>
#include <algorithm>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N, K;
	std::cin >> N >> K;
	
	std::vector<int> A;
	for(int i = 0; i < N; i++) {
		int temp;
		std::cin >> temp;
		
		A.push_back(temp);
	}
	
	std::sort(A.begin(), A.end());
	
	std::cout << A.at(K-1);
	
	return 0;
}
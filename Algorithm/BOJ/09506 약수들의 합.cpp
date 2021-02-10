#include <iostream>
#include <vector>

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	while(true) {
		int n;
		std::cin >> n;
		
		if(n == -1) break;
		
		int sum = 0;
		std::vector<int> v;
		for(int i = 1; i < n; i++) {
			if(n%i == 0) {
				v.push_back(i);
				sum += i;
			}
		}
		
		if(sum == n) {
			std::cout << n << " = " << v.at(0);
			for(int i = 1; i < v.size(); i++) {
				std::cout << " + " << v.at(i);
			}
			std::cout << "\n";
		}
		else
			std::cout << n << " is NOT perfect.\n";
	}
	
	return 0;
}
#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	int n;
	std::cin >> n;
	
	for(int i = 0; i < n; i++) {
		int a, b, c;
		std::cin >> a >> b >> c;
		
		a *= a; b *= b; c *= c;
		int sum = a+b+c;
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		std::cout << "Scenario #" << i+1 << ":\n";
		if(sum-max == max)
			std::cout << "yes\n\n";
		else
			std::cout << "no\n\n";
	}
	
	return 0;
}
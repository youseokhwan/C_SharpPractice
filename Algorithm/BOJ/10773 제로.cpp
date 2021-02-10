#include <iostream>
#include <stack>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int K;
	std::cin >> K;
	
	std::stack<int> s;
	for(int i = 0; i < K; i++) {
		int n;
		std::cin >> n;
		
		if(n != 0)
			s.push(n);
		else
			s.pop();
	}
	
	int sum = 0;
	while(!s.empty()) {
		sum += s.top();
		s.pop();
	}
	
	std::cout << sum;
	
	return 0;
}
#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	bool computer[101] = { 0, };
	int N;
	std::cin >> N;
	
	int count = 0;
	for(int i = 0; i < N; i++) {
		int num;
		std::cin >> num;
		
		if(computer[num])
			count++;
		else
			computer[num] = true;
	}
	
	std::cout << count;
	
	return 0;
}
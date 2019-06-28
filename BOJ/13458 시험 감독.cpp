#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	int* num = new int[N];
	for(int i = 0; i < N; i++)
		std::cin >> num[i];
	
	int B, C;
	std::cin >> B >> C;
	
	long long count = 0;
	for(int i = 0; i < N; i++) {
		if(num[i]-B <= 0) {
			count++;
			continue;
		}
		else 
			count = count + (num[i]-B)/C + ((num[i]-B)%C != 0) + 1;
	}
	
	std::cout << count;
	
	return 0;
}
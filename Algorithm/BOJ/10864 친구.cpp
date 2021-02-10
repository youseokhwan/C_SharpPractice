#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N, M;
	std::cin >> N >> M;
	
	int* num = new int[N+1];
	for(int i = 0; i < M; i++) {
		int A, B;
		std::cin >> A >> B;
		
		num[A]++;
		num[B]++;
	}
	
	for(int i = 1; i <= N; i++) {
		std::cout << num[i] << "\n";
	}
	
	delete[] num;
	
	return 0;
}
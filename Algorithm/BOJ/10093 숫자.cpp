#include <iostream>
using namespace std;

int main() {
	unsigned long long A, B;
	cin >> A >> B;
	
	if(A > B) {
		unsigned long long temp = A;
		A = B;
		B = temp;
	}
	else if(A == B) {
		cout << 0;
		return 0;
	}
	
	cout << B-A-1 << '\n';
	for(unsigned long long i = A+1; i < B; i++) {
		cout << i << ' ';
	}

	return 0;
}

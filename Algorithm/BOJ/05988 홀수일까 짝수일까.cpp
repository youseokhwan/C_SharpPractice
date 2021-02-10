#include <iostream>
using namespace std;

int main() {
	int N;
	cin >> N;
	
	for(int i = 0; i < N; i++) {
		string K;
		cin >> K;
		
		if((K.at(K.size()-1) - 48) % 2 == 0)
			cout << "even\n";
		else
			cout << "odd\n";
	}
	
	return 0;
}

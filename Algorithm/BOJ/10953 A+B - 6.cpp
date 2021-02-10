#include <iostream>
using namespace std;

int main() {
	int T;
	cin >> T;
	
	for(int i = 0; i < T; i++) {
		string operand;
		cin >> operand;
		
		cout << (int)operand.at(0) + (int)operand.at(2) - 96 << '\n';
	}
	
	return 0;
}

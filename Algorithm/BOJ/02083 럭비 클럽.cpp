#include <iostream>
using namespace std;

int main() {
	while(true) {
		string name;
		int age, weight;
		cin >> name >> age >> weight;
		
		if(name.compare("#") == 0)
			break;
		
		cout << name;
		if(age > 17 || weight >= 80)
			cout << " Senior\n";
		else
			cout << " Junior\n";
	}
	
	return 0;
}

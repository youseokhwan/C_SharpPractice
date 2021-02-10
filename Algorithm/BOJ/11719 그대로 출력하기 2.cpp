#include <iostream>
using namespace std;

int main(int argc, char* argv[]) {
	string inputString;
	int count = 0;
	
	while(true) {
		if(++count > 100)
			break;
		
		getline(cin, inputString);
		if(inputString.size() > 100)
			break;
		
		cout << inputString << endl;
	}
	
	return 0;
}
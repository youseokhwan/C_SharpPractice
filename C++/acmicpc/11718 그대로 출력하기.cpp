#include <iostream>
using namespace std;

int main(int argc, char* argv[]) {
	string inputString;
	
	while(true) {
		getline(cin, inputString);
		
		if(inputString.size() == 0)
			break;
		else {
			cout << inputString << endl;
			inputString.clear();
		}
	}
	
	return 0;
}
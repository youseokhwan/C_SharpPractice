#include <iostream>
using namespace std;

int main() {
	string table[4][6] = { {"SHIP NAME", "N2 Bomber", "J-Type 327", "NX Cruiser", "N1 Starfighter", "Royal Cruiser"},
						  {"CLASS", "Heavy Fighter", "Light Combat", "Medium Fighter", "Medium Fighter", "Light Combat"},
						  {"DEPLOYMENT", "Limited", "Unlimited", "Limited", "Unlimited", "Limited"},
						  {"IN SERVICE", "21", "1", "18", "25", "4"} };
	
	cout.flags(ios::left);
	for(int i = 0; i < 6; i++) {
		
		cout.width(15);
		cout << table[0][i];
		
		cout.width(15);
		cout << table[1][i];
		
		cout.width(11);
		cout << table[2][i];
		
		cout.width(10);
		cout << table[3][i] << '\n';
	}

	return 0;
}

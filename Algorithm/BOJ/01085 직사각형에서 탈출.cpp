#include <iostream>
using namespace std;

int main() {
	int x, y, w, h;
	cin >> x >> y >> w >> h;
	
	int distance = 500;
	if(x < distance)
		distance = x;
	
	if(y < distance)
		distance = y;
	
	if(w-x < distance)
		distance = w-x;
	
	if(h-y < distance)
		distance = h-y;
	
	cout << distance;
	
	return 0;
}

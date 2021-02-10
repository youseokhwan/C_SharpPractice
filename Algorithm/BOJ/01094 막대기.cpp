#include <iostream>

int main() {
	int X;
	scanf("%d", &X);
	
	int count = 0;
	while(true) {
		if(X <= 2){
			count = count + X/2 + X%2;
			break;
		}
		
		count += X%2;
		X/=2;
	}
	
	printf("%d", count);
	
	return 0;
}
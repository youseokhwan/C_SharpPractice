#include <iostream>

int main() {
	int N;
	scanf("%d", &N);
	
	for(int i = 0; i < N; i++) {
		for(int j = N-1; j > i; j--)
			printf(" ");
		
		for(int j = 0; j <= i; j++)
			printf("*");
		
		printf("\n");
	}
	
	for(int i = 0; i < N-1; i++) {
		for(int j = 0; j <= i; j++)
			printf(" ");
		
		for(int j = N-1; j > i; j--)
			printf("*");
		
		printf("\n");
	}
	
	return 0;
}
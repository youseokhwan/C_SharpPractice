#include <iostream>

int main() {
	int date;
	int car[5];
	
	scanf("%d", &date);
	for(int i = 0; i < 5; i++)
		scanf("%d", &car[i]);
	
	int count = 0;
	for(int i = 0; i < 5; i++)
		if(date == car[i])
			count++;
	
	printf("%d", count);
	
	return 0;
}
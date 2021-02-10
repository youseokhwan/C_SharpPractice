#include <iostream>
#include <vector>
#include <algorithm>

struct Point {
	int x, y;
};

bool yFirst(Point A, Point B) {
	if(A.y == B.y)
		return (A.x < B.x);
	else
		return (A.y < B.y);
}

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	std::vector<Point> v;
	for(int i = 0; i < N; i++) {
		int x, y;
		std::cin >> x >> y;
		
		v.push_back(Point{x, y});
	}
	
	std::sort(v.begin(), v.end(), yFirst);
	
	std::vector<Point>::iterator iter;
	for(iter = v.begin(); iter != v.end(); iter++)
		std::cout << (*iter).x << " " << (*iter).y << "\n";
	
	return 0;
}
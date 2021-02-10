#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

bool wordCompare(std::string A, std::string B) {
	if(A.size() == B.size()) {
		if(A.compare(B) < 0) return true;
		else return false;
	}
	else
		return A.size() < B.size();
}

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	std::vector<std::string> v;
	for(int i = 0; i < N; i++) {
		std::string str;
		std::cin >> str;
		
		v.push_back(str);
	}
	
	std::sort(v.begin(), v.end(), wordCompare);
	v.erase(unique(v.begin(), v.end()), v.end());
	
	std::vector<std::string>::iterator iter;
	for(iter = v.begin(); iter != v.end(); iter++)
		std::cout << *iter << "\n";
	
	return 0;
}
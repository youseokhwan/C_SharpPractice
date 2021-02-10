#include <iostream>
#include <vector>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;

	std::vector<std::string> name;	
	for(int i = 0; i < N; i++) {
		std::string temp;
		std::cin >> temp;
		name.push_back(temp);
	}
	
	int count[26] = { 0, };
	for(int i = 0; i < N; i++)
		count[(int)name.at(i).at(0)-'a']++;
	
	std::string output = "";
	for(int i = 0; i < 26; i++)
		if(count[i] >= 5)
			output += ('a'+i);

	if(output.size() == 0)
		std::cout << "PREDAJA";
	else
		std::cout << output;
	
	return 0;
}
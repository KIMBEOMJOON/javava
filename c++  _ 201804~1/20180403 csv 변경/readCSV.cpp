#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <stdio.h>
#include <string>
using namespace std;

vector<vector<string>> readCSV(const char* filePath) {
	freopen(filePath, "r", stdin);
	vector<vector<string>> ar(1);
	int row = 0;
	char temp = cin.get();
	string word; word += temp;
	while (!cin.eof()) {
		if (temp == ',') {
			ar[row].push_back(word);
			word = "";
		}
		else if (temp == '\n') {
			ar[row++].push_back(word);
			ar.push_back(vector<string>());			
			word = "";
		}
		else {
			word += temp;
		}
		temp = cin.get();
	}
	fclose(stdin);
	return ar;
}

int print2dStrAr(const vector<vector<string>> ar) {
	for (int i = 0; i < ar.size(); i++) {
		for (int j = 0; j < ar[i].size(); j++) {
			cout << ar[i][j] << '	';
		}
		cout << '\n';
	}
	return 1;

}


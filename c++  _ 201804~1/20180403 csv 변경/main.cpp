#define _CRT_SECURE_NO_WARNINGS
#include "readCSV.h"
#include <stdio.h>
#include <iostream>
using namespace std;





int main() {
	
	char filePath[100];
	scanf("%s", filePath);
	vector<vector<string>> a = readCSV(filePath);
	print2dStrAr(a);

	return 0;
}
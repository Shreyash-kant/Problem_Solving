#include<iostream>
#include<cstring>
using namespace std;
int main(){
	string s1,s2;
	int afterbreak =0;
	cin >> s1 >> s2;
	for(int i=0;i<s1.length();++i){
		char c1 = tolower(s1[i]);
		char c2 = tolower(s2[i]);
		if(c1<c2){
			printf("%d",-1);
			afterbreak = 1;
     		break;
		}
		else if(c2<c1){
			printf("%d",1);
			afterbreak=1;
			break;
		}
	}
	if(!afterbreak)
	printf("%d",0);
	return 0;
}

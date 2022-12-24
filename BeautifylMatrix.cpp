#include <iostream>
#include<cstdlib>
using namespace std;
int main()
{
	int row=0,col=0,temp;
	for(int i=0;i<25;++i){
		scanf("%d",&temp);
		if(temp==1){
			row = i/5;
			col = i%5;
			++row;
			++col;
			break;
		}
	}
		int result = abs(3-row);
		result+= abs(3-col);
		printf("%d",result);
    
    return 0;
}

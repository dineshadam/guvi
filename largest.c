#include<stdio.h>
void main(){
int x,y,z;
printf("\n enter the number x \t y \t z\n");
scanf("%d %d%d",&x,&y,&z);
if(x>y&&x>z){
    printf("\n x is greater");
            }
else if(y>x&&y>z){
    printf("\n y is greater");
                }
else {
    printf("\n z is greater");
}
}


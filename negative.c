#include<stdio.h>
void main()
{
int a;
printf("enter a number");
scanf("%d",&a);
if(a>0)
{
printf("given number is positive");
}
else if(a<0)
{
    printf("given num is negative");
}
else
 {
     printf("the given num is zero");
}
getch();
}

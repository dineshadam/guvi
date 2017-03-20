#include<stdio.h>

void main()
{
    char a;
    printf("enter the character");
    scanf("%c",&a);
    if(a>='a'||a>='A')
        printf("the given character is alphabet");
        else
        printf("the given number is not alphabet");
}

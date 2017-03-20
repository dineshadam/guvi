#include<stdio.h>
#include<string.h>
int main()
{
    char x;
    printf("enter the character");
    scanf("%c",&x);
    if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
        printf("the given character is  vowvel");
    }
    else
        printf("the given character is consonant");
    return 0;
}

#include <stdio.h>
#pragma warning(disable:4996)
void main(){
    char ch;
    int Nchar = 0, Nnum = 0, Nblank = 0;
    printf("Please insert string : ");
    while((ch = getchar()) != '\n'){
        if (ch>='0' && ch<='9')
            ++Nnum;
        else if (ch == ' ' || ch=='\t')
            ++Nblank;
        else
            ++Nchar;
    }

printf("\n ***** result *****\n");
printf("Numver = %d \n", Nnum);
printf("Sapce = %d \n", Nblank);
printf("String = %d \n",Nchar);
}
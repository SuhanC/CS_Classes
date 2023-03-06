#include <stdio.h>
#include <stdlib.h>
#pragma warning(disable:4996)

void main(){
    int suhancho;
    while(suhancho!=0){
    printf("1000-9000 integer : ");
    scanf("%d", &suhancho);
    if (suhancho >=1000 && suhancho<=9000 && suhancho%2 ==0){
        printf("%s,Even number ",&suhancho);
    }
    else if(suhancho >=1000 && suhancho<=9000 && suhancho%2 ==1){
        printf("%s,Odd number ",&suhancho);
    }

    else if ((suhancho <1000 || suhancho>9000)&&suhancho!=0){
        printf("please insert right range of numbers. ");
    } 
    }
    if(suhancho==0){
    printf("Program ending.");
    exit(0);
    }   
}



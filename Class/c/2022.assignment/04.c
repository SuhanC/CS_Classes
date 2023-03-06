#include <stdio.h>
char upper(char ch);
char lower(char ch);
void main(){
    char in_s[5], out_s[50];
    char ch;
    int i =0;
    printf("insert string. within 50 chars : ");
    scanf("%s",in_s);
    ch = in_s[i];
    while(ch!='\0'){
        if(ch>='A'&&ch<='Z')
            out_s[i]=lower(ch);
        else if(ch>='a'&&ch<='z')
            out_s[i] = upper(ch);
        else
            out_s[i]=ch;
        i++;
            ch = in_s[i];
        
    }
    out_s[i] = '\0';
    printf("Transformed result ==> %s \n",out_s);
}
char upper(char ch){
    return ch-32;
}
char lower(char ch){
    return ch+32;
}


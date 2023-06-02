#include <stdio.h>
#include <stdlib.h>
#include<time.h>

int main(){
    int palpite,num,range;
    int cont=1,tentativas;
    
    printf ("Seja bem vindo!\n");
    printf ("Qual será o valor maximo?\n");
    scanf ("%d",&range);
    printf ("Qual será a quantidade maxima de tentativas?\n");
    scanf ("%d",&tentativas);
    system("clear");
    
    srand(time(NULL));
    num=rand()%range;
    
    for (cont=1;cont<=tentativas;cont++){
        printf ("Digite um palpite:\n");
        scanf ("%d", &palpite);
        if (palpite<0 || palpite>range)
            printf ("Valor invalido\n");
        else if (palpite==num){
            printf ("CERTO!!\n");
            printf ("Voce acertou em %d tentativas!\n",cont);
            break;
        }
        else if (palpite<num && cont<tentativas)
            printf ("Tente um numero maior!\n\n");
        else if (palpite>num && cont<tentativas)
            printf ("Tente um numero menor!\n\n");
        if (cont==tentativas){
                printf ("Voce perdeu!\n");
                printf ("O numero correto era %d\n",num);
            }
        }
    
    return 0;
}

#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p, valor=10;
    
    p = &valor;
    
    printf("Endereço da variavel = %p\n", &valor);
	printf("Valor do ponteiro = %p\n", p);
	printf("Valor da variavel = %d\n", *p);

    return 0;
}

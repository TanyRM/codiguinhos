#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define L 38
#define C 5
#include <locale.h>

typedef struct {
	              int RG;
	              char nome[100];
	              float valor;
	              char email[100];
	              char tel[16];
	              char tel_cs[16];
	              char nome_cs[100];
	              char status;
	              }passageiro;

typedef struct {
	              char num_voo[6];
	              char origem[20];
	              char destino[20];
	              char data[5];
	              float valor;
                int horass;
                int mins;
                int horasc;
                int minc;
                float valor_total;
                passageiro poltrona[L][C];
	              }voo;
	
void inicializar_voo(voo *v){
	int i,j;
	for (i=1;i<L;i++){
		for (j=1;j<C;j++){
			v->poltrona[i][j].status='L';
		}}
	printf ("BEM VINDO\n");
	printf ("Entre com o local de origem: \n");
	scanf ("%s",v->origem);
	getchar();
	printf ("Entre com o local de destino: \n");
	scanf ("%s",v->destino);
	getchar();
	printf ("Entre com o número do voo: \n");
	scanf ("%s", v->num_voo);
	getchar();
	printf ("Entre com a data do voo: \n");
	scanf ("%s",v->data);
	getchar();
	printf ("Entre com o horário de saída: \n");
	scanf ("%d %d",&v->horass,&v->mins);
	getchar();
	printf ("Entre com o horário de chegada: \n");
	scanf ("%d %d",&v->horasc,&v->minc);
	getchar();
	printf ("Valor da passagem: \n");
	scanf ("%f",&v->valor);
	getchar();
	v->valor_total = 0.0;
	}
	
void criar_voo (voo v) {   // sem a struct...
  FILE *fp;  
  fp = fopen ("VOO.dat", "wb"); //arquivo para escrita binária
  if (fp == NULL) {  
    printf ("Erro ao abrir o arquivo.\n");  
    return;  
    }  
  else {  
    printf ("Arquivo Binario criado com sucesso.\n");  
    fwrite(&v, sizeof(voo), 1, fp); 
    }         
    fclose (fp);  
  }/*Função reponsavel por exibir o conteudo do arquivo Binario.dat*/
void Carregar_voo(voo *v){
  FILE *fp;
  fp = fopen ("VOO.dat", "rb"); 
  if (fp == NULL) {  
    inicializar_voo(&(*v));
		return;
    }  
  else {
    fread(&(*v),sizeof(voo),1,fp);
    fclose(fp);
    }
  }
  
void menu (){
	printf ("***** M E N U *****\n");
	printf ("1- Informações do voo\n");
	printf ("2- Compra de passagem\n");
	printf ("3- Informações do passageiro\n");
	printf ("4- Relação de passageiros\n");
	printf ("5- Cancelar passagem\n");
	printf ("6- Consultar status de poltronas\n");
	printf ("7- Fechar\n");
	printf ("Entre com a opção desejada: \n");
	}

void informacoes_voo (voo *v){
	printf ("%s\n",v->num_voo);
	printf ("Origem: %s\n",v->origem);
	printf ("Destino: %s\n",v->destino);
	printf ("%s\n",v->data);
	printf ("Horário de saída: %dh%dmin\n",v->horass,v->mins);
	printf ("Horário de chegada: %dh%dmin\n",v->horasc,v->minc);
	printf ("Valor da passagem: %.2f\n",v->valor);
	}

void poltronas_disponiveis (voo v){
  int i,j;
  printf ("    POLTRONAS    \n\n");
	for (i=1;i<L;i++){
	  printf ("%2dA-%c ",i,v.poltrona[i][1].status);
		printf ("%2dB-%c ",i,v.poltrona[i][2].status);
		printf ("%2dC-%c ",i,v.poltrona[i][3].status);
		printf ("%2dD-%c ",i,v.poltrona[i][4].status);
		printf ("\n");
	  }
  }
// compra de passagem do cliente 
void emissao_passagem (passageiro *p){ 
	printf ("Digite o RG do passageiro: \n");
	scanf ("%d",&(p->RG));
	getchar();
	printf ("Digite o nome do passageiro: \n");
	fgets (p->nome,100,stdin);
	printf ("Digite o email do passageiro: \n");
	fgets (p->email,100,stdin);
	printf ("Digite o telefone do passageiro: \n");
	fgets (p->tel,16,stdin);
	printf ("Nome de contato para casos de acidentes: \n");
	fgets (p->nome_cs,100,stdin);
	printf ("Telefone do contato para casos de acidentes: \n");
	fgets (p->tel_cs,16,stdin);
	printf ("Digite o valor pago: \n");
	scanf ("%f",&p->valor);
	}
	
void realizar_compra(voo *v, passageiro p) {
  int i,j;
	printf ("Escolha uma poltrona disponível: \n");
  poltronas_disponiveis(*v);
  printf ("Digite o número da poltrona: \n");
  scanf ("%d %d",&i,&j);
  v->poltrona[i][j]=p;
  v->poltrona[i][j].status='O'; 
  v->valor_total += p.valor;
  }

void cancelar_compra (voo *v, passageiro p){
	int i,j;
	printf ("Escolha uma poltrona ocupada: \n");
  poltronas_disponiveis(*v);
  printf ("Digite o número da poltrona: \n");
  scanf ("%d %d",&i,&j);
  v->poltrona[i][j]=p;
  v->poltrona[i][j].status='L';
	v->valor_total -= p.valor;
	}
	
void informacoes_passageiro (passageiro p,int i, int j){
	printf ("      Dados do passageiro:\n poltrona:%d-%d\n",i,j);
	printf ("RG: %d\n",p.RG);
	printf ("Nome: %s\n",p.nome);
  printf ("Telefone: %s\n",p.tel);
	printf ("Email: %s\n",p.email);
	printf ("Nome do contato para emergências: %s\n",p.nome_cs);
	printf ("Telefone do contato para emergencias: %s\n",p.tel_cs);
	printf ("Valor pago: %.2f\n",p.valor);
	}
	
void verificar_passageiro (voo V){
  int i,j;
    for (i=1;i<L;i++){
      for (j=1;j<C;j++){
        if (V.poltrona[i][j].status=='O'){
                informacoes_passageiro(V.poltrona[i][j],i,j);
        }
      }
    }
  }
  
int main (){
  voo V,*v;
  passageiro P;
  int op,i,j,poltrona[i][j];
  double valor_total;
  Carregar_voo(&V);
  setlocale(LC_ALL,"Portuguese");
  do{ menu();
	  scanf("%d",&op);
      switch(op) {
     	 case 1: informacoes_voo(&V);
     				 	break;

     	 case 2: emissao_passagem(&P);
                realizar_compra(&V,P);
                printf ("Compra realizada!\n");
                verificar_passageiro(V);
                break;
                
        case 3: poltronas_disponiveis(V);
       	       printf ("Selecione uma poltrona ocupada: \n");
       	       scanf ("%d %d",&i,&j);
       	       if (V.poltrona[i][j].status=='O') {
                    informacoes_passageiro(V.poltrona[i][j],i,j);
               }
                else 
                printf ("Esta poltrona não está ocupada\n");
                break;
                
        case 4: for (i=1;i<L;i++){
	                for (j=1;j<=C;j++){
	                  if (V.poltrona[i][j].status=='O') {
	               		informacoes_passageiro(V.poltrona[i][j],i,j);
	               	   printf ("%d\n\n",poltrona[i][j]);
	               		 }
	               	 }
	                }
	                 printf ("Valor total arrecadado: %.2f\n", V.valor_total);

	               break;
	              
       	case 5: cancelar_compra(&V,P);
       	        printf ("Passagem cancelada!\n");
       	        
                 break;
       	case 6: poltronas_disponiveis(V);
                 break;

       	case 7: printf ("Obrigado por usar!\n");
       	        criar_voo(V);
       	        break;
       }
    }while (op!=7);

  return 0;
  }
  

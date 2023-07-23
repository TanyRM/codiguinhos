package intros.src;

class Carro {

     String cor;
     double preco;
     String modelo;

    /* CONSTRUTOR PADRÃO */
    public Carro(){}

    /* CONSTRUTOR COM 2 PARÂMETROS */
    public Carro(String modelo, double preco){
    //Se for escolhido o construtor sem a COR do veículo
    // definimos a cor padrão como sendo PRETA
        this.cor = "PRETA";
        this.modelo = modelo;
        this.preco = preco;
    }

    /* CONSTRUTOR COM 3 PARÂMETROS */
    public Carro(String cor, String modelo, double preco){
        this.cor = cor;
        this.modelo = modelo;
        this.preco = preco;
    }
}

class Main {

    public static void main(String[] args) {
    //Construtor sem parâmetros
        Carro prototipoDeCarro = new Carro();

        //Construtor com 2 parâmetros
        Carro civicPreto = new Carro("New Civic",40000);

        //Construtor com 3 parâmetros
        Carro golfAmarelo = new Carro("Golf", 38000);
        
        System.out.println(civicPreto.preco);
    }
}

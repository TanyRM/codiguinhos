//exemplo de instanciação de classes e criação de objetos com uso de métodos
public class Carro{
    //atributos
    String placa;
    double capCombs;
    int passageiros;
    double gastoCombs;
    
    //método simples
    void exibirPassageiros(){
        System.out.println("O método simples foi chamado");
        System.out.printf("São permitidos %d passageiros.\n", passageiros);
    }
    //método com retorno
    int calcularBancos(){
        System.out.println("O método com retorno foi chamado");
        return passageiros/2;
    }
    //método com parametros
    double calcularGasto(double km){
        System.out.println("O método com parâmetros foi chamado");
        double gasto = gastoCombs*km;
        return gasto;
        }
    
    public static void main (String[] args){
        //criação de objetos ou instanciação da classe
        Carro van = new Carro();
        van.placa ="abc-123";
        van.cap_combs = 40.5;
        van.gastoCombs = 1.5;
        
        Carro fusca = new Carro();
        fusca.placa = "def-456";
        
        System.out.println(van.placa);
        //retorno do método simples
        van.exibirPassageiros();
        //retorno do método com retorno usando variável
        int bancos = van.calcularBancos();
        System.out.printf("bancos: %d\n",bancos);
        //retorno sem variável
        System.out.println(van.calcularBancos());
        //retorno do método com parametros usando variáveis
        double gasto = van.calcularGasto(15);
        System.out.printf("Total de gasolina gasto: %f\n", gasto);
        //retorno sem variável
        System.out.println(van.calcularGasto(15));
    }
}

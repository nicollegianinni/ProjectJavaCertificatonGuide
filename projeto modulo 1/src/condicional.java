public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento =2022;
        boolean incluidoNoPlanoBasico = true;
        double mediaDeAvaliacaoFilme = 8.1;
        String tipoDePlano = "plus";


        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estao curtindo!");
        } else{
            System.out.println("Filme retro que vale a pena assistir");
        }
        if (incluidoNoPlanoBasico == true || tipoDePlano.equals("plus")) {
        } else System.out.println(" Para obter o filme, pague o plano plus!");
    }
}

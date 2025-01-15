public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindos ao Nick Flix!");

        // informações atributos
        String nomeDoFilme;
        int anoDeLancamento;
        double mediaDeAvaliacaoFilme;
        String sinopse;
        String genero;
        String atores;

        // metodos
        nomeDoFilme= "Top Gun: Maverick";
        sinopse = "Estreado há muitos anos por Tom Cruise, Top Gun: Meverick ressurge com uma nova historia emocionante, onde depois de muitos anos o Coronel e instrutor de aviação pete Maverick Mitchell volta a passar suas habilidades para os mais novos alunos. ";
        anoDeLancamento = 2022 ;
        mediaDeAvaliacaoFilme = (9.8 + 6.3 + 8.0 ) /3;
        genero = " Ação, aventura, galã dos anos 80";
        atores= "Tom Cruise, Jennifer Connely, Miles Teller, jon hamm e outros";
        boolean incluidoNoPlanoBasico = true;

        // classe de saida
        System.out.println("nomeDoFilme: " + nomeDoFilme + "\nSinopse: " + sinopse + "\nAno do lançamento: " + anoDeLancamento + "\nAvaliação do filme: "
                + mediaDeAvaliacaoFilme+ "\nGenero: " + genero + "\nPrincipais atores: " + atores + "\n" + incluidoNoPlanoBasico);


        System.out.println("""
                escreve o texto
                pulando a linha que quiser
                
                outra forma de separar string 
                depois concatena
                
        """+ anoDeLancamento);

        //Format text
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String nomeAluno = "Nicolle";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nomeAluno, aulas);

        System.out.println(mensagem);

        //casting tranformando uma variavel maior em uma menor
        // se a variavel for double e precisar dividir usa o (int)

        double media = 11;

        int salario;
        salario = (int) (media / 2);
        System.out.println(salario);
    }

}
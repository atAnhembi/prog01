public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p2 = new Pessoa();

        p.nome = "Emerson";
        p.idade = 12;
        p2.nome = "Paduan";
        p2.idade = 45;

        p.possoDirigir();
        p2.possoDirigir();
        // p.apresentar();
        // p2.apresentar();
        // System.out.println(p.nome);
        // System.out.println(p.idade);
        // System.out.println(p2.nome);
        // System.out.println(p2.idade);
    }
}

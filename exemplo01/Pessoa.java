
public class Pessoa {
    // atributos = características
    String nome;
    int idade;

    // métodos = ações
    void apresentar() {
        System.out.println("Olá, eu sou " + nome);
    }

    void possoDirigir() {
        if(idade >= 18) {
            System.out.println(nome + " pode dirigir");
        } else {
            System.out.println(nome + " não pode dirigir");
        }
    }
}
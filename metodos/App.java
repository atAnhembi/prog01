import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Garcom g = new Garcom();
        String pedido, bebida;
        double preco;
        int tipo, qtde;

        g.ligarAr();

        pedido = g.tragaBatata();
        System.out.println("Seu pedido: " + pedido);

        preco = g.precoHamburger();
        System.out.println("Preço = " + preco);

        bebida = g.tragaBebida(2, 4);
        System.out.println("Bebida: " + bebida);

        System.out.println("----------");
        System.out.println("1. suco\n2. refrigerante\n3. água");
        tipo = teclado.nextInt();
        System.out.println("Quantos?");
        qtde = teclado.nextInt();

        bebida = g.tragaBebida(tipo, qtde);
        System.out.println("Suas bebidas: " + bebida);
        System.out.println("-----------");
    }
}

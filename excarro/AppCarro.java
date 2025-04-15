import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String modelo, marca;
        double  consumo;
        int opcao;
        Carro carro = null;

        opcao = 0;
        while (opcao != 5) {
            System.out.println("1- criar novo carro");
            System.out.println("2- abastecer");
            System.out.println("3- andar");
            System.out.println("4- exibir dados");
            System.out.println("5- sair");
            opcao = Integer.parseInt(teclado.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Qual a marca? ");
                    marca = teclado.nextLine();
                    System.out.println("Qual o modelo:");
                    modelo = teclado.nextLine();
                    System.out.println("Qual o consumo?");
                    consumo = Double.parseDouble(teclado.nextLine());
                    carro = new Carro(marca, modelo, consumo);
                    break;
                case 2:
                    // exercício
                    break;
                case 3:
                    // exercício
                    break;
                case 4:
                    System.out.println(carro.exibir());
                    break;
                case 5:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        teclado.close();
    }
}

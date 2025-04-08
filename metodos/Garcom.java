
public class Garcom {
    String nome;
    
    void ligarAr() {
        System.out.println("ar ligado");
    }

    String tragaBatata() {
        return "batata";
    }

    // responda qual o preço do hamburger?
    double precoHamburger() {
        return 21.50;
    }

    // uso de parâmetros
    String tragaBebida(int tipo, int quantidade) {
        if(tipo == 1) {
            return  quantidade + " suco(s)";
        } else {
            if(tipo == 2) {
                return quantidade + " refrigerante(s)";
            } else {
                return quantidade + " água(s)";
            }
        }
    }

}
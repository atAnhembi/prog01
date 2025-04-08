// Encapsulamento: esconder os atributos e não permita acesso direto
// public pode acessar de qualquer lugar
// private somente pode acessar de dentro da própria classe

public class Relogio {
    private int hora, minuto, segundo;

    // Construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // *** EXERCÍCIO ***
    
    // Escreva os métodos getMinuto, setMinuto, getSegundo, setSegundo
    // Teste os métodos no main para ver se estão funcionando corretamente

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void exibir() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
}
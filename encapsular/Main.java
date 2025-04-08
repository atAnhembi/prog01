public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(20, 50, 30);

        // relogio.hora = 79;
        // relogio.minuto = -34;
        // relogio.segundo = 3;

        // relogio.setHora(19);
        // relogio.setMinuto(20);
        // relogio.setMinuto(60);
        // relogio.setSegundo(11);
        // relogio.setSegundo(-11);

        relogio.exibir();

        int horaAtual = relogio.getHora();
        System.out.println("Hora atual: " + horaAtual);

    }
}

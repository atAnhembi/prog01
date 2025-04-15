public class Carro {
    private String marca, modelo;
    private double combustivel, consumo;
    private int km;

    public Carro(String marca, String modelo, double consumo) {
        if (marca == null || marca.isEmpty() ) {
            System.out.println("Marca inválida");
            this.marca = "indefinido";
        } else {
            this.marca = marca;
        }

        if (modelo == null || modelo.isEmpty() ) {
            System.out.println("Modelo inválida");
            this.modelo = "indefinido";
        } else {
            this.modelo = modelo;
        }

        if(consumo <= 0){
            System.out.println("Consumo inválido");
        } else {
            this.consumo = consumo;
        }
    }

    public boolean abastecer(double litros) {
        if(litros > 0){
            combustivel = combustivel + litros;
            return true;
        } 
        return false;
    }

    public boolean andar(double distancia) {
        if(distancia <= 0) {
            return false;
        }
        boolean podeAndar = (distancia <= combustivel * consumo);
        if(podeAndar) {
            km += distancia;
            combustivel -= distancia / consumo;
            return true;
        }
        return false;
    }

    public String exibir() {
        return marca + ": " + modelo + " - " + consumo + " km/l " + km + " km " + combustivel + " l";
    }

}
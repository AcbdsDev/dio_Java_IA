package poo.pilares_poo.pilares;

public class Encapsulamento_Auto {
    public static void main(String[] args) {
        Encapsulamento_Carro carro = new Encapsulamento_Carro();
        carro.setChassi("234567");
        //carro.ligar();

        Heranca_Moto mistubishi = new Heranca_Moto();
        mistubishi.setChassi("34526");
        //mistubishi.ligar();
        //carro.combustivel();
        //carro.cambio();

        Veiculo coringa = carro;
        coringa.ligar();
    }

}

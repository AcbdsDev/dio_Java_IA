package poo.pilares_poo.pilares;

public class Encapsulamento_Carro extends Veiculo {
    /*private String chassi;
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }*/

    public void ligar() {
        cambio();
        combustivel();
        System.out.println("Carro ligado!");

    }

    private void combustivel() {
        System.out.println("Conferindo Combustível!");
    }

    private void cambio() {
        System.out.println("Conferindo Cambio!");
    }
}
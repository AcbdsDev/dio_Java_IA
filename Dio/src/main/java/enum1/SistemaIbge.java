package enum1;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
            System.out.println(e.getSigla() + "_" + e.getNome());
        }
        EstadosBrasileiros Pr = EstadosBrasileiros.Parana;

        System.out.println(Pr.getNome());
        System.out.println(Pr.getSigla());
        System.out.println(Pr.getNomeMaiusculo("Paraná"));
    }
}
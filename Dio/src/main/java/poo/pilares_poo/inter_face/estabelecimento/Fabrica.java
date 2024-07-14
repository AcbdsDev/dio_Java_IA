package poo.pilares_poo.inter_face.estabelecimento;

import poo.pilares_poo.inter_face.equipamentos.copiadora.Copiadora;
import poo.pilares_poo.inter_face.equipamentos.digitalizadora.Digitalizadora;
import poo.pilares_poo.inter_face.equipamentos.impressora.Diskjet;
import poo.pilares_poo.inter_face.equipamentos.impressora.Impressora;
import poo.pilares_poo.inter_face.equipamentos.impressora.Laserjet;
import poo.pilares_poo.inter_face.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional mu = new Multifuncional();
        Impressora impressora = new Laserjet();
        Digitalizadora digitalizadora = mu;
        Copiadora copiadora = mu;

        System.out.println();

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}

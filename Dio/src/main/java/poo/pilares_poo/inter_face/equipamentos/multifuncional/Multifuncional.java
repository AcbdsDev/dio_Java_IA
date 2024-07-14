package poo.pilares_poo.inter_face.equipamentos.multifuncional;

import poo.pilares_poo.inter_face.equipamentos.copiadora.Copiadora;
import poo.pilares_poo.inter_face.equipamentos.digitalizadora.Digitalizadora;
import poo.pilares_poo.inter_face.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO Via equipamento multifuncional.");

    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO Via equipamento multifuncional.");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO Via equipamento multifuncional.");
    }
}

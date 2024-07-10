package anatomia_das_classes;
public class AnatomiaDeClasses3 {


    public static void main(String[] args) {

    int idade = 23;
    double altura = 1.72;
    String Dogspik = "afsf";
    String anoFabricacao1 = "2019";
    String meuNome = "Artu";
    boolean verdadeira = true;
    String anoFabricacao0 = "2018";

    String nomeCompleto = nomeCompleto(anoFabricacao0, anoFabricacao1);

        System.out.println(nomeCompleto);


}
    public static String nomeCompleto (String anoFabricacao0, String anoFabricacao1) {
        return "O resultado é isso " +anoFabricacao0.concat(" ").concat(anoFabricacao1);
    }
}




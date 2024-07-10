package metodos;

public class UsuarioSmartv {
    public static void main(String[] args) throws Exception{
        Smartv smarTv = new Smartv();

        System.out.println("TV Ligada? "+smarTv.ligada);
        System.out.println("Canal Atual? "+smarTv.canal);
        System.out.println("Volume? "+smarTv.volume);

        smarTv.ligar();
        System.out.println("TV Ligada agora? "+smarTv.ligada);

        smarTv.diminuirVolume();
        System.out.println("O volume atual é "+ smarTv.volume);

        System.out.println("Canal atual antes " +smarTv.canal);
        smarTv.mudarCanal(13);
        System.out.println("Canal atual depois " +smarTv.canal);
    }
}

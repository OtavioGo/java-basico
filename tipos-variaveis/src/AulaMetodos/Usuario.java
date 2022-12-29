package AulaMetodos;

public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTV smartTV = new SmartTV();

        smartTV.desligar();
        System.out.println("Tv Ligada : " + smartTV.ligada);

        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        smartTV.mudarCanal(5);
        System.out.println("Canal Atual : " + smartTV.canal);

        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume Atual : " + smartTV.volume);
    }
}

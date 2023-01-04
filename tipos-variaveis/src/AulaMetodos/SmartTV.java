package AulaMetodos;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("A TV esta ligada");
    }
    public void desligar(){
        ligada = false;
        System.out.println("A TV esta desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o valume para: "+ volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o valume para: "+ volume);
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}

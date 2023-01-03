package EstruturaDeRepeticao;

import java.util.Scanner;

public class TiposRepeticao {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);


        //Programa Idade e nome
        String nome;
        int idade;

        while(true){
        System.out.println("Nome: ");
        nome = scan.next();
        if (nome.equals("0")) break;

        System.out.println("Idade: ");
        idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");
        //=============================================
        //Programa numeros entre 0 e 10
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota Invalida, digite novamente: ");
            nota = scan.nextInt();
        }
        //==============================================
        //Programa maior nota e média
        int nota1, media = 0, maior = 0, count = 0;

        do{
            System.out.println(count + "° Nota: ");
            nota1 = scan.nextInt();
            media += nota;
            if(nota > maior) maior = nota;

            count++;
       } while(count < 5);

       System.out.println("A maior nota foi: " + maior);
       System.out.println("A média é: " + (media/5));
    }
}

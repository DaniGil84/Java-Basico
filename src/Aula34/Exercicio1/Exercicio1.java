package Aula34.Exercicio1;

public class Exercicio1 {
    public static void main (String [] args){

        System.out.println(Contador.getContagem());

        Contador c1 = new Contador();
        System.out.println(Contador.getContagem());

        Contador c2 = new Contador();
        System.out.println(Contador.getContagem());

        Contador c3 = new Contador();
        System.out.println(Contador.getContagem());

        Contador.zerar();
        System.out.println(Contador.getContagem());

    }
}

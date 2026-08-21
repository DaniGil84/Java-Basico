package Aula24.Exercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Lampada lampada1 = new Lampada();
        lampada1.marca = "Phillips";
        lampada1.tipo = "LED_Baloon";
        lampada1.voltagem = 220;
        lampada1.preco = 70.45;
        lampada1.temp = 3000;
        lampada1.potencia = 7;
        lampada1.serialNumber = "7479";

        Lampada lampada2 = new Lampada();
        lampada2.marca = "Nordecor";
        lampada2.tipo = "Baloon";
        lampada2.voltagem = 220;
        lampada2.preco = 60.45;
        lampada2.temp = 4500;
        lampada2.potencia = 3;
        lampada2.serialNumber = "6986";

        estoqueLampada estoqueLampada1 = new estoqueLampada();
        estoqueLampada1.lampada = lampada1;
        estoqueLampada1.qtdd = 315;

        estoqueLampada estoqueLampada2 = new estoqueLampada();
        estoqueLampada2.lampada = lampada2;
        estoqueLampada2.qtdd = 215;


        Map<String, estoqueLampada> mapaEstoque = new HashMap<>();
        mapaEstoque.put(lampada1.serialNumber, estoqueLampada1);
        mapaEstoque.put(lampada2.serialNumber, estoqueLampada2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva qual o serial number deseja consultar no estoque");
        String serialNumberProcurado = scanner.nextLine();

                if(!mapaEstoque.containsKey(serialNumberProcurado)){
                    System.out.println("Serial number não encontrado!");
                    return;
                }

                estoqueLampada estoqueLampadaEncontrada = mapaEstoque.get(serialNumberProcurado);



        //System.out.println("Existem " + estoqueLampada1.qtdd + " lâmpadas com serialNumber " + estoqueLampada1.lampada.serialNumber);
        //System.out.println("Existem " + estoqueLampada2.qtdd + " lâmpadas com serialNumber " + estoqueLampada2.lampada.serialNumber);


    }

}

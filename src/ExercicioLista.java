import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ExercicioLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> materias = new ArrayList<>();
        System.out.println("Digite o nome das materias: ");

        boolean precisaSair = false;
        while (!precisaSair) {
            String materia = scanner.nextLine();
            materias.add(materia);
            System.out.println("Deseja cadastrar mais uma matéria? (S/n) ");
            String decisao = scanner.nextLine();
            switch (decisao) {
                case "n":
                case "não":
                case "Não":
                case "NÃO":
                case "nao":
                case "Nao":
                case "NAO":
                    precisaSair = true;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Você escreveu " + materias.size() + " matérias.");

        List<List<Float>> boletim = new ArrayList<>(materias.size());
        for (int posicaoMateria = 0; posicaoMateria < materias.size(); posicaoMateria++) {
            System.out.println("Digite as suas notas de " + materias.get(posicaoMateria) + ".");
            System.out.println("Digite -1 caso não tenha mais dados.");
            float numeroDigitado = scanner.nextFloat();
            boletim.add(new ArrayList<>());
            while (numeroDigitado >= 0) {
                boletim.get(posicaoMateria).add(numeroDigitado);
                numeroDigitado = scanner.nextFloat();
            }
        }
        System.out.println("Suas notas digitadas foram");
        for (int posicaoMateria = 0; posicaoMateria < materias.size(); posicaoMateria++) {
            String materia = materias.get(posicaoMateria);
            System.out.println(materia + ": ");
            List<Float> listaDeNotas = boletim.get(posicaoMateria);
            for (int posicaoNota = 0; posicaoNota < listaDeNotas.size(); posicaoNota++) {
                float nota = listaDeNotas.get(posicaoNota);
                System.out.print(nota);
                if (posicaoNota != listaDeNotas.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(".");
        }
    }
}


//List<String> materias = Arrays.asList("Portugues", "Matemática", "Inglês");
       /*for (int posicaoMateria = 0; posicaoMateria < 3; posicaoMateria++) {
            System.out.println("Digite as suas notas de " + materias.get(posicaoMateria) + ".");
            System.out.println("Digite -1 caso não tenha mais dados.");
            float numeroDigitado = scanner.nextFloat();
            while (numeroDigitado >= 0) {
                float valorAcumulado = primeiroBimestre.get(posicaoMateria);
                primeiroBimestre.set(posicaoMateria, valorAcumulado + numeroDigitado);
            }
        }*/

    /*List<String> materias = new ArrayList<>();
            System.out.println("Digite o nome das matérias: ");
            String materia = scanner.nextLine();
            materias.add(materia);

            System.out.println("Deseja cadastrar mais uma matéria? (S/n) ");
            String decisao = scanner.nextLine();

            while(!decisao.equals("n") || !decisao.equals("nao") ||!decisao.equals("não")){ // com exclamação antes transforma em negativo
                materia = scanner.nextLine();
                materias.add(materia);
                System.out.println("Deseja cadastrar mais uma matéria? (S/n) ");
                decisao = scanner.nextLine();*/
/*List<Float> notas = new ArrayList<>();

        System.out.println("Digite as suas notas.");
        System.out.println("Digite -1 caso não tenha mais dados.");

float numeroDigitado = scanner.nextFloat();
        while(numeroDigitado >=0)

        {
        notas.add(numeroDigitado);
numeroDigitado = scanner.nextFloat();
    }
            System.out.print("Você digitou as seguintes notas: ");
        for(
int i = 0; i<notas.size();i++)

        {
        System.out.print(notas.get(i));
        if (i != notas.size() - 1) {
        System.out.print(", ");

        }
                }
                System.out.println(",");
float somatorio = 0.0f;
        for(
float nota :notas)

        {
somatorio = somatorio + nota;
//MOESMO QUE somatorio = somatorio + nota;
    }

/* MESMO QUE
for (int i=0; i< notas.soze(); i++){
somatorio += notas.get(i);
//MESMO QUE somatorio = somatorio + notas.get(i);
}
    float media = somatorio / notas.size();
        System.out.

                println("Média final é "+media);
}*/
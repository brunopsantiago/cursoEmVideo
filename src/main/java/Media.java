import java.util.Scanner;

public class Media {

    public void calculaMedia(String nota1, String nota2, String nota3){
        double media;
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        nota1 = n1.nextLine();

        System.out.println("Informe o segundo numero");
        nota2 = n2.nextLine();

        System.out.println("Informe o terceio numero");
        nota3 = n3.nextLine();

        int nota1Conv = Integer.parseInt(nota1);
        int nota2Conv = Integer.parseInt(nota2);
        int nota3Conv = Integer.parseInt(nota3);

        media = (nota1Conv + nota2Conv + nota3Conv)/3;
        System.out.println("Média das notas "+nota1+" + "+nota2+" + "+nota3+" = "+media);

    }
}

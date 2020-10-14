import java.util.Scanner;

public class Tabuada {

    public void calculaTabuadadoNumero(String numero) {
        int valor;
        Scanner numeroTabuada = new Scanner(System.in);

        System.out.println("Informe o numero que deseja obter a tabuada");
        numero = numeroTabuada.nextLine();

        int numConve = Integer.parseInt(numero);

        for(int i = 0; i <= 10; i++) {
            valor = i * numConve;
            System.out.println(""+i+" x "+numero+" = "+valor);
        }
    }
}

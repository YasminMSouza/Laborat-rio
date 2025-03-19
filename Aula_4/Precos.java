import java.util.Scanner;

public class Precos {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double[] vetor = new Double[10];

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%d Entre com o preço dos produtos: " , i+1);
            vetor[i] = entrada.nextDouble () ;
        }
        
        System.out.printf("VALOR DO DESCONTO: ");
        Double desconto = entrada.nextDouble();

        for(int i = 0; i < desconto; i++){
        
            vetor [i] = vetor[i]* (1 - desconto/100);
            System.out.println("vetor" + i + ": R$" + vetor[i]);

        }
    }
}
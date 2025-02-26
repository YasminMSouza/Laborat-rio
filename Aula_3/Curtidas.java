import java.util.Scanner;

public class Curtidas {
    public static void main  (String[] args) {
       
    Scanner entrada = new Scanner (System.in);

    System.out.print("Informe o número de publicações que deseja analisar: ");
     int numeroPublicacoes = entrada.nextInt();
    
    int totalCurtidas = 0; // acumuladora

    for (int i = 1; i <= numeroPublicacoes; i++) {

        System.out.printf("Curtidas de Publicação #%d: ", i);
        int numeroCurtidas = entrada.nextInt();

        totalCurtidas = totalCurtidas + numeroCurtidas; 

        if (numeroCurtidas >= 100) {
            System.out.println("Publicação popular!");
        } else {
            System.out.println("Publicação com poucas curtidas");
        }
    }
       
    double mediaCurtidas = (double) totalCurtidas / numeroPublicacoes;
    System.out.printf("Média de curtidas = %.1f\n", mediaCurtidas);
    System.out.printf("Número de publicações = %d\n", numeroPublicacoes);
    entrada.close();

    }
 }

// ESTUDAR FORMATAÇÃO DE CODIGO
 // solicitar ao usuario o numero de publicacoes 
 // para cada publi, o programa vai pedir que o usuario informe quantas curtidas ele recebeu
 //cada curtida colocar se é =>100, se sim, imprimir "Publicação Popular!"
 // se não exibir "Publicação com poucas curtidas."
 // final informar a media de curtidas e o total de publicaçoes processadas
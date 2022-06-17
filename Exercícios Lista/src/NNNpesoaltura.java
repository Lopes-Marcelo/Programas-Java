import java.util.Scanner;

public class NNNpesoaltura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        float soma_altura = 0;
        float media_altura = 0;
        int qtd_mais_90 = 0;
        int qtd_menos_50 = 0;
        int qtd_mais_100 = 0;

        
        while (cont <= 7){
            System.out.print("Informe a " + cont + "º altura (em metros): ");
            int altura = teclado.nextInt();
            System.out.print("Informe o " + cont + "º peso (em Kg): ");
            int peso = teclado.nextInt();

            soma_altura = soma_altura + altura;

            if(peso >= 90){
                qtd_mais_90 ++;
            }

            if((peso <= 50) && (altura <= 1.60)){
                qtd_menos_50 ++;
            }

            if((peso >= 100) && (altura >= 1.90)){
                qtd_mais_100 ++;
            }

            cont += 1;
        }

        media_altura = soma_altura / 7;

        System.out.println("A média de altura do grupo cadastrado é de " + media_altura + " metros.");        
        if(qtd_mais_90 != 0){
            System.out.println(qtd_mais_90 + " pessoas cadastradas pesam mais que 90Kg."); 
        } else{
            System.out.println("Não foram cadastradas pessoas com mais de 90Kg!!");
        }
        if(qtd_menos_50 != 0){
            System.out.println(qtd_menos_50 + " pessoas cadastradas pesam menos que 50Kg e tem menos que 1,60 metros de altura."); 
        } else{
            System.out.println("Não foram cadastradas pessoas menores que 1,60 com menos de 50Kg!!");
        }
        if(qtd_mais_100 != 0){
            System.out.println(qtd_menos_50 + " pessoas cadastradas pesam mais que 100Kg e tem mais que 1,90 metros de altura."); 
        } else{
            System.out.println("Não foram cadastradas pessoas maiores que 1,90 com mais de 100Kg!!");
        }

        teclado.close();

        /*Desenvolva um aplicativo que leia o peso e altura de 7 pessoas, mostrando no final:
        a - Qual foi a média de altura do grupo.
        b - Quantas pessoas pesam mais de 90Kg.
        c - Quantas pesssoas que pesam menos de 50Kg tem menos de 1,60m.
        d - Quantas pessoas que medem mais de 1,90m pesam mais dde 100Kg. */
    }
}

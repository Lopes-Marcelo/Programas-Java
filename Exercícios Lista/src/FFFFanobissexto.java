import java.util.Scanner;

public class FFFFanobissexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Figite um ano qualquer: ");
        int ano = teclado.nextInt();

        if (ano % 4 == 0){
            System.out.println("O ano informado é bissexto!");
        } else {
            System.out.println("O ano informado não é bissexto!");
        }
        
        teclado.close();
        
        //Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.
    }
}

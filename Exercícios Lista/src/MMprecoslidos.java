import java.util.Scanner;

public class MMprecoslidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cont = 0 + 1;
        float maior = 0;
        float menor = 0;

        while (cont <= 8){
            System.out.println("Digite o " + cont + "º preço: ");
            float preco = teclado.nextFloat();
            cont += 1;

            if (preco > maior){
                maior = preco;
            }
            
            if(preco < menor){
                menor = preco;
            }
        }

        System.out.println("O maior preço é R$" + maior);
        System.out.println("O menor preço é R$" + menor);

        teclado.close();

        //Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.
    }
}

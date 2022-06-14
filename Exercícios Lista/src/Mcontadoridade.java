import java.util.Scanner;

public class Mcontadoridade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0 + 1;
        int maior = 0;
        int menor = 0;
        int maior_idade = 0;
        int soma = 0;
        float media = 0;

        while (cont <= 10){
            System.out.println("Digite a " + cont + "º idade: ");
            int idade = teclado.nextInt();
            cont += 1;
            soma = soma + idade;

            if (idade >= 18){
                maior += 1;
            }
            
            if(idade <= 5){
                menor += 1;
            }

            if(idade >= maior_idade){
                maior_idade = idade;
            }
        }

        media = soma / cont;

        System.out.println("A média de idade do grupo é " + media);
        System.out.println(maior + " pessoas tem mais de 18 anos.");
        System.out.println(menor + " pessoas tem menos de 5 anos.");
        System.out.println("A maior idade do grupo é " + maior_idade);

        teclado.close();

        /*Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
        a - Qual é a média de idade do grupo.
        b - Quantas pessoas tem mais de 18 anos.
        c - Quantas pessoas tem menos de 5 anos.
        d - Qual foi a maior idade lida.
        */
    }
}

import java.util.Scanner;

public class NNNNidade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0 + 1;
        int qtd_homens = 0;
        int qtd_mulheres = 0;
        int soma_idade_total = 0;
        float media_idade_total = 0;
        int soma_idade_homens = 0;
        float media_idade_homens = 0;
        int maior_20_mulheres = 0;
        

        while (cont <= 5){
            System.out.print("Informe a " + cont + "º idade: ");
            int idade = teclado.nextInt();
            System.out.print("Informe o " + cont + "º gênero, [1] Masculino/ [2] Feminino: ");
            int genero = teclado.nextInt();

            switch(genero){
                case 1:
                qtd_homens += 1;
                soma_idade_homens = soma_idade_homens + idade;
                
                case 2:
                qtd_mulheres += 1;

                default:
                System.out.println("Informe o número corretamente!!");
            }

            soma_idade_total = soma_idade_total + idade;

            if((genero == 2) && (idade >= 20)){
                maior_20_mulheres += 1;
            }

            cont += 1;
        }

        media_idade_total = soma_idade_total / 5;
        media_idade_homens = soma_idade_homens / qtd_homens;

        if(qtd_homens != 0){
            System.out.println("Foram cadastrados " + qtd_homens + " homens.");
        } else{
            System.out.println("Homens não foram cadastrados!!");
        }
        if(qtd_mulheres != 0){
            System.out.println("Foram cadastradas " + qtd_mulheres + " mulheres.");
        } else{
            System.out.println("Mulheres não foram cadastradas!!");
        }
        System.out.println("A média de idade do grupo é de " + media_idade_total + " anos.");
        if(media_idade_homens != 0){
            System.out.println("A média de idade entre os homens cadastrados é de " + media_idade_homens + " anos.");
        } else{
            System.out.println("Homens não foram cadastrados!!");
        }
        if(maior_20_mulheres != 0){
            System.out.println(maior_20_mulheres + " mulheres acima de 20 anos foram cadastradas.");
        } else{
            System.out.println("Não foram cadastradas mulheres acima de 20 anos!!");
        }

        teclado.close();

        /*faça um programa que leia o sexo e a idade de 5 pessoas, mostrando no final:
        a - Quantos homens foram cadastrados.
        b - Quantas mulheres foram cadastradas.
        c - A média de idade do grupo.
        d - A média de idade dos homens.
        e - Quantas mulheres tem mais de 20 anos. */
    }
}


import java.util.Scanner;

public class BBBmenu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Raiz quadrada de um número");
        System.out.print("Informe sua opção: ");
        int resposta = teclado.nextInt();

        switch(resposta){
            case 1:
                System.out.println("Digite um valor para o primeiro número: ");
                int num1 = teclado.nextInt();
                System.out.println("Digite um valor para o segundo número: ");
                int num2 = teclado.nextInt();
                int soma = num1 + num2;
                System.out.println("A soma de " + num1 + " e " + num2 + " é  igual a " + soma);
                break;

            case 2:
                System.out.println("Digite o valor: ");
                int numero1 = teclado.nextInt();
                double raiz = Math.sqrt(numero1);
                System.out.println("A raíz quadrada de " + numero1 + " é " + raiz);
                break;

            default:
                System.out.println("Opção inválida!!");
                break;
        }

        teclado.close();
    }
}

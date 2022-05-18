import java.util.Scanner;

public class GGGGtriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        float l1 = teclado.nextFloat();
        System.out.print("Digite um outro valor: ");
        float l2 = teclado.nextFloat();
        System.out.print("Digite mais um valor: ");
        float l3 = teclado.nextFloat();

        boolean triangulo = (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);
        
        if (triangulo = true){
            System.out.println(triangulo + ", é possível formar um triângulo com esses valores informados!");
        } else {
            System.out.println(triangulo + ", não é possível formar um triângulo com esses valores!");
        }

        teclado.close();
        
        //Crie um programa que leia o tamanho de três segmentos de reta. Analise seus comprimentos e diga se é possível formar um triângulo com essas retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.
    }
}

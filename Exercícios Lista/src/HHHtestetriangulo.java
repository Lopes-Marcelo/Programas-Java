import java.util.Scanner;

public class HHHtestetriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        float l1 = teclado.nextFloat();
        System.out.print("Digite um outro valor: ");
        float l2 = teclado.nextFloat();
        System.out.print("Digite mais um valor: ");
        float l3 = teclado.nextFloat();

        boolean triangulo = (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);
        boolean triangulo_eq = (l1 == l2) && (l2 == l3) && (l3 == l1);
        boolean triangulo_iso = (l1 == l2) || (l2 == l3) || (l3 == l1);
        boolean triangulo_esca = (l1 != l2) && (l2 != l3) && (l3 != l1);

        
        if (triangulo = true){
            System.out.print(triangulo + ", é possível formar um triângulo com esses valores.");
            if (triangulo_eq = true){
                System.out.println(triangulo_eq + ", e esse triângulo é equilátero.");
            }
            if (triangulo_iso = true){
                System.out.println(triangulo_iso + ", e esse triângulo é isósceles.");
            }
            if (triangulo_esca = true){
                System.out.println(triangulo_esca + ", e esse triângulo é escaleno.");
            } else {
                System.out.println("Não é possível formar um triângulo com esses valores");
            }
        }

        teclado.close();
        
        //Crie um programa que leia o tamanho de três segmentos de reta. Analise seus comprimentos e diga se é possível formar um triângulo com essas retas e mostrando que tipo de triângulo será formado a partir dos valores informados: EQUILÁTERO: todos os lados iguais. ISÓSCELES: dois lados iguais. ESCALENO: todos os lados diferentes.
    }
}

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a altura do triângulo em cm: ");
        int altura = teclado.nextInt();
        System.out.print("Informe a base do trinângulo em cm: ");
        int base = teclado.nextInt();
        double area = (base * altura)/2;
        System.out.println("A área do triângulo informado é: " + area + " cm².");
        teclado.close();
        
        //Exercício 10
    }    
}

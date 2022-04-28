import java.util.Scanner;

public class BBBBnotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a nota 1: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Informe a nota 2: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2)/2;
        System.out.println("A média do aluno é: " + media);
        teclado.close();
        
        //Exercício 5 
        /*Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
        na tela a sua média na disciplina.*/
    }
    
}

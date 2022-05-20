import java.util.Scanner;

public class IIIimc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu peso (Kg): ");
        float peso = teclado.nextFloat();
        System.out.println("Informe sua altura (m): ");
        float altura = teclado.nextFloat();
        
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if ((imc >= 18.5) && (imc < 25)){
            System.out.println("Parabéns, você está no peso ideal.");
        } else if (imc < 18.5){
            System.out.println("Você está abaixo do peso.");
        } else if ((imc >= 25) && (imc < 30)){
            System.out.println("Você está com sobrepeso.");
        } else if ((imc >= 30) && (imc < 40)){
            System.out.println("Você está obeso.");
        } else if (imc >= 40){
            System.out.println("Você possui obesidade mórbida.");
        }

        teclado.close();

        /*O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o indivíduo dentro de certas faixas.
        - abaixo de 18.5: Abaixo do peso
        - entre 18.5 e 25: Peso ideal
        - entre 25 e 30: Sobrepeso
        - entre 30 e 40: Obesidade
        - acima de 40: Obseidade mórbida
        Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado da altura).*/
    }
}

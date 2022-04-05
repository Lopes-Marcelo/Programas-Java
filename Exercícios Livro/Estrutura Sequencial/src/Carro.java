import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor de fábrica do veículo: ");
        double valorbase = teclado.nextDouble();
        System.out.print("Informe o percentual de lucro do distribuidor: ");
        double percentual = teclado.nextDouble();
        System.out.print("Informe a porcentagem de imposto cobrado: ");
        double imposto = teclado.nextDouble();
        double imposto_final = (imposto/100) * valorbase;
        double percentual_final = (percentual/100) * valorbase;
        double valor_final = valorbase + percentual_final + imposto_final;
        System.out.println("O valor correspondente ao lucro do distribuidor é: R$" + percentual_final);
        System.out.println("O valor correspondente aos impostos é: R$" + imposto_final);
        System.out.println("O valor final do veículo é de: R$" + valor_final);
        teclado.close();
    }
    
}

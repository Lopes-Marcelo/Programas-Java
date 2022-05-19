import java.util.Scanner;

public class Gterreno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a largura do terreno: ");
        float largura = teclado.nextFloat();
        System.out.print("Informe o comprimento do terreno: ");
        float comprimento = teclado.nextFloat();
        
        double area = largura * comprimento;

        if (area < 100){
            System.out.println("Terreno possui " + area + "m². Abaixo de 100m²: TERRENO POPULAR.");
        }

        if ((area > 100) && (area < 500)){
            System.out.println("Terreno possui " + area + "m². Entre 100m²e 500m²: TERRENO MASTER.");
        }

        if (area > 500){
            System.out.println("Terreno possui " + area + "m². Entre 100m²e 500m²: TERRENO MASTER.");
        }
        teclado.close();
        
        //Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m². O programa também devemostrar a classificação desse terreno, de acordo com a lista abaixo: Abaixo de 100m² = TERRENO POPULAR/ Entre 100m² e 500m² = TERRENO MASTER/ Acima de 500m² = TERRENO VIP.
    }
}

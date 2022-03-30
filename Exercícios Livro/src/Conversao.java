import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma medida em pés: ");
        int pe = entrada.nextInt();
        int polegada, jarda, milha;
        polegada = pe * 12;
        jarda = pe /3;
        milha = (pe /3)/1760;
        System.out.println("Esse valor em polegadas significa: " + polegada);
        System.out.println("Esse valor em jardas significa: " + jarda);
        System.out.println("Esse valor em milhas significa: " + milha);
        entrada.close();
    }
    
}

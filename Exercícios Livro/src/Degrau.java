import java.util.Scanner;

public class Degrau {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a altura do degrau em metros: ");
        double alt_deg = teclado.nextDouble();
        System.out.print("Informe a altura requerida pelo usuário: ");
        double alt_usu = teclado.nextDouble();
        double qnt_deg = Math.ceil(alt_usu / alt_deg);
        System.out.println("A quantidade de degraus necessária será de: " + qnt_deg + ".");
        teclado.close();
    }
    
}

import java.util.Scanner;

public class Fmultipla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas o animal possui? ");
        int pernas = teclado.nextInt();
        String tipo;
        teclado.close();

        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break; 
        }
        
        System.out.println(tipo);

        //Estrutura condicional múltipla
    } 
}

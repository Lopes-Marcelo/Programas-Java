import java.util.Scanner;

public class LLLLanteriorresolvido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor inicial: ");
        int valor_inicial = teclado.nextInt();
        System.out.print("Informe o valor final: ");
        int valor_final = teclado.nextInt();
        System.out.print("Informe o valor do incremento: ");
        int valor_salto = teclado.nextInt();

        if (valor_inicial < valor_final) {
            int cont = valor_inicial;
            while (cont <= valor_final){
                System.out.println(cont);
                cont += valor_salto;
            }
            System.out.println("Acabou!");
        } else if (valor_inicial > valor_final){
            int cont = valor_inicial;
            while (cont >= valor_final){
                System.out.println(cont);
                cont -= valor_salto;
            }
            System.out.println("Acabou!");
        }
        
        teclado.close();

        //O programa anterior vai ter um problema quando digitamos o primeiro valor maior que o último. Resolva esse problema com um código que funcione em qualquer situação.
    }
}

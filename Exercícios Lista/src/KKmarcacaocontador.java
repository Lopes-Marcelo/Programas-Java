public class KKmarcacaocontador {
    public static void main(String[] args) {

        int cont = 30;

        while (cont >= 2){
            cont -= 1;
            if (cont % 4 == 0){
                System.out.println("[" + cont + "]");
            } else {
                System.out.println(cont);
            }
        }

        //Crie um programa que mostre uma contagem regressiva de 30 até 1, marcando todos os números que forem divisíveis por 4.
    }
}

import java.util.Random;

public class MMMsorteio {
    public static void main(String[] args) {
        System.out.println("Vamos sortear 20 números!");
        int cont = 0 + 1;
        int maior = 0;
        int divisiveis = 0;

        while (cont <= 20){
            Random random = new Random();

            int numero_sorteado = random.nextInt(10);
            System.out.println(numero_sorteado);
            cont += 1;

            if (numero_sorteado >= 5){
                maior += 1;
            } else if(numero_sorteado % 3 == 0){
                divisiveis += 1;
            }
        }

        System.out.println("Desses números " + maior + " são maiores ou iguais a 5.");
        System.out.println("Desses números " + divisiveis + " são divisíveis por 3.");

        /*Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela:
        a - Quais foram os números sorteados.
        b - Quantos números estão acima de 5.
        c - Quantos números são divisíveis por 3. 
        */
    }
}

import java.util.Arrays;

public class Hvetor {
    public static void main(String[] args) {
        int n[] = {3,4,8,2,1,9};

        for (int cont = 0; cont <= 5; cont ++){
            System.out.println(n[cont]);
        }

        
        int nu[] = {3,4,8,2,1,9};

        System.out.println("Total de casas do vetor é " + nu.length);
        for (int cont = 0; cont <= 5; cont ++){ //poderia ter colocado para que ele vá até cont <= n.length - 1, visto que todo vetor começa em 0.
            System.out.println("Na posição " + cont + " temos o número " + nu[cont]);
        }


        String mes[] = {"Jan" , "Fev" , "Mar" , "Abr" , "Mai" , "Jun" , "Jul" , "Ago" , "Set" , "Out" , "Nov" , "Dez"}; 
        String tot[] = {"31" , "28" , "31" , "30" , "31" , "30" , "31" , "31" , "30" , "31" , "30" , "31"};

        for (int i = 0; i <= 11; i++){
            System.out.println(mes[i] + " tem " + tot[i] + " dias.");
        }


        int nume [] = {3, 5, 1, 8, 4};  // forma fácil de manipular vetor, apenas com vetor.
        for (int valor: nume){ 
            System.out.println(valor);
        }

        
        double v[] = {2.45 , 5.5 , 7.9 , 9.99};  // vetor com valores reais.
        for (double valor: v){
            System.out.println(valor);
        }

        
        int num[] = {5, 9, 2, 6, 7};  // dispor o vetor em ordem.
        Arrays.sort(num);
        for (int valor: num){
            System.out.println(valor);
        }


        int numero [] = {5, 9, 2, 6, 7};  // busca de um valor dentro do vetor.
        int pos = Arrays.binarySearch(numero,6);
        System.out.println(pos);

        
        int numeros[] = new int [20];
        Arrays.fill(numeros, 0); // preenchimento automático de vetor.
        for (int valor: numeros){
            System.out.print(valor + " ");
        }
        
        // Estrutura de vetor
    }
}

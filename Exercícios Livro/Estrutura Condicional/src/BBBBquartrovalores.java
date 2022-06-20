import java.util.Scanner;

public class BBBBquartrovalores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor para A: ");
        int num_a = teclado.nextInt();
        System.out.println("Informe um valor para B: ");
        int num_b = teclado.nextInt();
        System.out.println("Informe um valor para C: ");
        int num_c = teclado.nextInt();
        System.out.println("Informe um valor para I (1, 2 ou 3): ");
        int num_i = teclado.nextInt();

        switch(num_i){
            case 1: 
                if((num_a < num_b) && (num_a < num_c)){
                    if(num_b < num_c){
                        System.out.println("A ordem crescente dos números é: " + num_a + " - " + num_b + " - " + num_c);
                        break;
                    } else{
                        System.out.println("A ordem crescente dos números é: " + num_a + " - " + num_c + " - " + num_b);
                        break;
                    }
                }
                if((num_b < num_a) && (num_b < num_c)){
                    if(num_a < num_c){
                        System.out.println("A ordem crescente dos números é: " + num_b + " - " + num_a + " - " + num_c);
                        break;
                    } else{
                        System.out.println("A ordem crescente dos números é: " + num_b + " - " + num_c + " - " + num_a);
                        break;
                    }
                }
                if((num_c < num_a) && (num_c < num_b)){
                    if(num_a < num_b){
                        System.out.println("A ordem crescente dos números é: " + num_c + " - " + num_a + " - " + num_b);
                        break;
                    } else{
                        System.out.println("A ordem crescente dos números é: " + num_c + " - " + num_b + " - " + num_a);
                        break;
                    }
                }

            case 2:
                if((num_a > num_b) && (num_a > num_c)){
                    if(num_b > num_c){
                        System.out.println("A ordem decrescente dos números é: " + num_a + " - " + num_b + " - " + num_c);
                        break;
                    } else{
                        System.out.println("A ordem decrescente dos números é: " + num_a + " - " + num_c + " - " + num_b);
                        break;
                    }
                }
                if((num_b > num_a) && (num_b > num_c)){
                    if(num_a > num_c){
                        System.out.println("A ordem decrescente dos números é: " + num_b + " - " + num_a + " - " + num_c);
                        break;
                    } else{
                        System.out.println("A ordem decrescente dos números é: " + num_b + " - " + num_c + " - " + num_a);
                        break;
                    }
                }
                if((num_c > num_a) && (num_c > num_b)){
                    if(num_a > num_b){
                        System.out.println("A ordem decrescente dos números é: " + num_c + " - " + num_a + " - " + num_b);
                        break;
                    } else{
                        System.out.println("A ordem decrescente dos números é: " + num_c + " - " + num_b + " - " + num_a);
                        break;
                    }
                }

            case 3:
                if((num_a > num_b) && (num_a > num_c)){
                    System.out.println("A ordem desejada é: " + num_b + " - " + num_a + " - " + num_c);
                    break;
                }
                if((num_b > num_a) && (num_b > num_c)){
                    System.out.println("A ordem desejada é: " + num_a + " - " + num_b + " - " + num_c);
                    break;
                }
                if((num_c > num_a) && (num_c > num_b)){
                    System.out.println("A ordem desejada é: " + num_a + " - " + num_c + " - " + num_b);
                    break;
                }

            default:
                System.out.println("Informe um número correto para I!!");

        }

        teclado.close();        
    }
}

import java.util.Random;

public class HHjokenpo {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("JoKenPo");
        System.out.println(" ");

        Random random = new Random();

        int mao_1 = random.nextInt(2);
        int mao_2 = random.nextInt(2);
        

        if (mao_1 == 0){
            System.out.println("Jogador 1: Pedra");
        }

        if (mao_1 == 1){
            System.out.println("Jogador 1: Papel");
        }

        if (mao_1 == 2){
            System.out.println("Jogador 1: Tesoura");
        }

        if (mao_2 == 0){
            System.out.println("Jogador 2: Pedra");
        }

        if (mao_2 == 1){
            System.out.println("Jogador 2: Papel");
        }

        if (mao_2 == 2){
            System.out.println("Jogador 2: Tesoura");
        }

        System.out.println(" ");
        
        //Crie um jogo de JoKenPo (Pedra, Papel e Tesoura).
    }
}

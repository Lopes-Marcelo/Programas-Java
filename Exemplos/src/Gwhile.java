public class Gwhile {
    public static void main(String[] args) {
        int cont = 1;
        while (cont < 5) {
            System.out.println("Cambalhota " + cont);
            cont ++;
        }

        int conta = 0;
        while (conta < 10) {
            conta ++;
            if ((conta == 5) || (conta == 7)) {
                continue;
            }
            System.out.println("Número " + conta);
        }

        int conti = 0;
        while (conti < 10) {
            conti ++;
            System.out.println("Número " + conti);
            if (conti == 7) {
                break;
            }

            // Estrutura de repetição - while
        }
    }
}


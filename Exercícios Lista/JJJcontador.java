public class JJJcontador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu salário atual: R$ ");
        float salario_inicial = teclado.nextFloat();
        System.out.println("Informe seu genêro Masculino [M]/ Feminino[F]: ");
        String genero = teclado.next();
        System.out.println("Infome há quantos anos você trabalha na empresa: ");
        int anos = teclado.nextInt();


        teclado.close();

        //Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!
    }
}

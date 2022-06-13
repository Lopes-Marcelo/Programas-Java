public class LLLcontadorsoma {
    public static void main(String[] args) {
        int cont = 6;
        int soma = 0;

        while (cont <= 100){
            System.out.println(cont);
            cont += 2;
            soma = soma + cont;
        }

        System.out.println("A soma desses valores é igual a " + soma);

        //Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 8 + 10 + 12 + 14 + 16 ... + 98 + 100.
    }
}

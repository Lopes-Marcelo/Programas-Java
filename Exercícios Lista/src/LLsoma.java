public class LLsoma {
    public static void main(String[] args) {
        int cont = 500;
        int soma = 0;

        while (cont >= 0){
            System.out.println(cont);
            cont -= 50;
            soma = soma + cont;
        }

        System.out.println("A soma desses valores é igual a " + soma);

        //Crie um programa que calcule e mostre na tela o resultado da soma entre 500 + 450 + 400 + 350 + 300 + 250 + ... + 50 + 0.
    }
}

import java.util.Scanner;

public class IIIIemprestimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da casa: R$");
        float valor_casa = teclado.nextFloat();
        System.out.println("Informe seu salário: R$");
        float salario = teclado.nextFloat();
        System.out.println("Em quantos anos pretende realizar o pagamento? ");
        int anos = teclado.nextInt();

        int parcelas = anos * 12;
        double prestacao = valor_casa/parcelas;
        boolean s1 = prestacao <= (salario * 0.3);
        boolean s2 = prestacao > (salario * 0.3);

        if (s1 = true){
            System.out.println("S1 " + s1);
            System.out.println("O empréstimo foi aprovado mediante " + parcelas + " parcelas de R$" + prestacao + ".");
        } else {
            System.out.println("S2 " + s2);
            System.out.println("O empréstimo foi negado mediante " + parcelas + " parcelas de R$" + prestacao + ".");
        }

        teclado.close();

        //Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado.
    }
}

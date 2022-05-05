
public class Daritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;
        System.out.println("A média entre 5 e 3 é " + media);

        int numero = 5;
        int valor = 5 + numero++; // são diferentes e retornarão valores difirentes int valor = 5 + ++numero;
        System.out.println(valor);
        System.out.println(numero);

        int x = 4;
        x += 2; // OU x = x + 2
        System.out.println(x);

        int v =  5;
        int ex = (int) Math.pow(v,2); // Outros são: pi, sqrt ou cbrt
        System.out.format("A raíz quadrada de 5 é " + ex);

        float val = 8.9f;
        int ar = (int) Math.floor(val); // Outros são: ceil, round ou abs
        System.out.println(ar);

        double ale = Math.random();
        int n =(int) (2 + ale *(9 -2 ));
        System.out.println(n);

        // Operadores Aritméticos
    }
}

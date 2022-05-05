public class Eoperadoreslogicos {

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 2;
        boolean r;
        r = (x < y && y < z)? true:false;     // && significa "e"
        System.out.println(r);

        int a = 3;
        int b = 4;
        int c = 2;
        boolean res;
        res = (a < b || b < c)? true:false;     // || significa "ou"
        System.out.println(res);

        int d = 3;
        int e = 4;
        int f = 2;
        boolean resp;
        resp = (d < e ^ e < f)? true:false;     // ^ significa "ou exclusivo"
        System.out.println(resp);

        int l = 3;
        int m = 4;
        boolean resposta;
        resposta = !(l < m)? true:false;     // ! significa "não"
        System.out.println(resposta);
    }
    
}

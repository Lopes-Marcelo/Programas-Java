import java.util.Locale;

public class Bidiomasistema {
    public static void main(String[] args) {
        
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é o ");
        System.out.println (loc.getDisplayLanguage()); // imprime “Português”

        // Tools - idioma do sistema
    }  
}
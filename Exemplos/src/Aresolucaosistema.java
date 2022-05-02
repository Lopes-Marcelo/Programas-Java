import javax.tools.Tool;

public class Aresolucaosistema {
    public static void main(String[] args) {
        Tool tk = Tool.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
    }
}

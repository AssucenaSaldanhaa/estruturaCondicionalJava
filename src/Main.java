import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x=  Integer.parseInt(numero("digite o numero"));

        if (x>0){
            mostrarMensagem("numero positivo");
        }
        else {
            mostrarMensagem("numero negativo");
        }

    }
    public static String numero(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
    public static void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
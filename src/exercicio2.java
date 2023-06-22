import javax.swing.*;
import java.util.Scanner;

public class exercicio2 {
 // N % 2 == 0
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N;
        N=  Integer.parseInt(numero("digite o numero"));
        if (N % 2 == 0){
            mostrarMensagem("Numero par");
        }
         else {
             mostrarMensagem("Numero impar");
        }

    }
    public static String numero(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
    public static void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }

}

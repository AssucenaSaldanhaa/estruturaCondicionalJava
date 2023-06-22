import javax.swing.*;
import java.util.Scanner;

public class exercicio3 {
 //A % B == 0 || B % A == 0
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A, B;
        A= Integer.parseInt(numero("digite o numero"));
        B= Integer.parseInt(numero("digite o segundo numero"));

        if(A % B == 0 || B % A == 0){
            mostrarMensagem("esses numero sao multiplos");
        } else {
            mostrarMensagem("esses numeros não são multiplos");
        }

}
    public static String numero(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
    public static void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

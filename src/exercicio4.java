import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int inicioDojogo, finalDoJogo;
        inicioDojogo =Integer.parseInt(horarioJogo("inicio do jogo"));
        finalDoJogo = Integer.parseInt(horarioJogo("final do jogo"));

        if(inicioDojogo > finalDoJogo) {
            mostrarMensagem( "o tempo de duração é" + (24 - (inicioDojogo - finalDoJogo)));
        }

    }
    public static String horarioJogo(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
    public static void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }

}

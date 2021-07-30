import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Введите URL: ");
        StringBuffer url = new StringBuffer((src.next()));
        url.insert(12, "ss");

        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(URI.create(url.toString()));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

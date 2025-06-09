package app;

import java.util.Scanner;
import logica.CifraDeCesar;

public class AppDescriptografar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CifraDeCesar cifra = new CifraDeCesar();

        System.out.print("Digite o texto cifrado: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a chave: ");
        int chave = scanner.nextInt();

        String resultado = cifra.descriptografar(texto, chave);
        System.out.println("Texto original: " + resultado);

        scanner.close();
    }
}

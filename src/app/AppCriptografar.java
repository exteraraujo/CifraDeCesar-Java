package app;

import java.util.Scanner;
import logica.CifraDeCesar;

public class AppCriptografar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CifraDeCesar cifra = new CifraDeCesar();

        System.out.print("Digite o texto para criptografar: ");
        String texto = scanner.nextLine();

        int chave = (int) (Math.random() * 25 + 1); // Chave aleatória

        String resultado = cifra.criptografar(texto, chave);
        System.out.println("Texto criptografado: " + resultado);
        System.out.println("(Chave usada: " + chave + ")");

        scanner.close();
    }
}

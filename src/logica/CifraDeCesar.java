package logica;

public class CifraDeCesar {
    private final String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String criptografar(String texto, int chave) {
        texto = texto.toUpperCase();
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int pos = alfabeto.indexOf(c);

            if (pos == -1) {
                resultado += c;
            } else {
                int novaPos = (pos + chave) % 26;
                resultado += alfabeto.charAt(novaPos);
            }
        }

        return resultado;
    }

    public String descriptografar(String texto, int chave) {
        texto = texto.toUpperCase();
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int pos = alfabeto.indexOf(c);

            if (pos == -1) {
                resultado += c;
            } else {
                int novaPos = (pos - chave + 26) % 26;
                resultado += alfabeto.charAt(novaPos);
            }
        }

        return resultado;
    }
}



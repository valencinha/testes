//Segunda pergunta

public class Fibonacci {
    public static void main(String[] args) {
        int N = 21; // Número de termos da sequência desejado
        int[] fibonacci = new int[N];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calcula os termos subsequentes
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Verifica se o número informado pertence à sequência
        int numeroInformado = 34;

        boolean pertence = false;
        for (int termo : fibonacci) {
            if (termo == numeroInformado) {
                pertence = true;
                break;
            }
        }

        if (pertence) {
            System.out.println(numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }
}
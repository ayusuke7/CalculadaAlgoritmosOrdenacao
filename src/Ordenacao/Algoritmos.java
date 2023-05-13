package Ordenacao;

/**
 *
 * @author YU7
 */
public class Algoritmos {

    public int[] BubbleSort(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }

        }
        return vetor;
    }

    public int[] InsertionSort(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i - 1;
            while (j >= 0 && aux < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;

        }
        return vetor;
    }

    public int[] SelectionSort(int[] vetor) {

        for (int pivor = 0; pivor < vetor.length - 1; pivor++) {

            int menor = pivor;

            for (int i = menor + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[menor]) {
                    menor = i;
                }
            }

            if (menor != pivor) {
                int t = vetor[pivor];
                vetor[pivor] = vetor[menor];
                vetor[menor] = t;
            }

        }

        return vetor;

    }

    public void QuickSort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {
            int pivor = SepararVetor(vetor, inicio, fim);
            QuickSort(vetor, inicio, pivor - 1);
            QuickSort(vetor, pivor + 1, fim);
        }

    }

    private int SepararVetor(int[] vetor, int inicio, int fim) {

        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;

        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

}

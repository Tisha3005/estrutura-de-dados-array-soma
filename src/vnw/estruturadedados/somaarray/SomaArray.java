package vnw.estruturadedados.somaarray;

public class SomaArray {

    public static void main(String[] args) {
        
//         posicoes       0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |  9 | 10
//         vlr posicoes   1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11


        int vetor[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        final int num = 11;
        int soma = 0;
        int pos1;
        int pos2;

        for (int i = 0; i <= vetor.length - 1; i++) {
            for (int j = 0; j <= vetor.length - 1; j++) {
                pos1 = vetor[i];
                pos2 = vetor[j];
                soma = pos1 + pos2;
                if (pos1 != pos2) {
                    if (soma == num) {
                        System.out.println("Indices: " + "[" + i + "," + j + "]");
                    }
                }
            }
        }
    }
}
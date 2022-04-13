import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String[] Cidades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "ASUNCION",
                "Sao Paulo", "Lima", "Santigo", "Lisboa", "Tokio"};
        int[][] vetor = new int[][]{
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };
        int tempMaisFria = 0;
        int tempMaisAlta = 0;
        int cidadeMaisQuente = 0;
        int cidadeMaisFria = 0;



        for (int i = 0; i < Cidades.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (tempMaisAlta < vetor[i][j]) {
                    tempMaisAlta = vetor[i][j];
                    cidadeMaisQuente = i ;
                }
                if (vetor[i][j] < tempMaisFria  ) {
                    tempMaisFria = vetor[i][j];
                    cidadeMaisFria = i;
                }
            }
        }
        System.out.println("Cidade mais fria:" + Cidades[cidadeMaisFria] +" Temperatura Min:" + tempMaisFria);
        System.out.println("Cidade mais quente é:" + Cidades[cidadeMaisQuente] + " Temperatura Max:" + tempMaisAlta);

    }
}

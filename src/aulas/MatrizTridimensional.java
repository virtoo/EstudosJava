package aulas;

public class MatrizTridimensional {
    public static void main(String[] args) {

        int[][][] matrizTri = new int[3][3][3];
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTri.length; i++){
            for (int j = 0; j < matrizTri[i].length; j++){
                for (int k = 0; k < matrizTri[i][j].length; k++){
                    matrizTri[i][j][k] = i + j + k;
                    System.out.println("i = " + i + " - j = " + j + " - k = " + k);
                }
                System.out.println();
            }
        }

        System.out.println();
        for (int i = 0; i < matrizTri.length; i++){
            for (int j = 0; j < matrizTri[i].length; j++){
                for (int k = 0; k < matrizTri[i][j].length; k++){
                    soma += matrizTri[i][j][k];
                    if (matrizTri[i][j][k] % 2 == 0){
                        somaPares += matrizTri[i][j][k];
                    } else {
                        somaImpares += matrizTri[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma Total:       " + soma);
        System.out.println("Soma dos Pares:   " + somaPares);
        System.out.println("Soma dos Ímpares: " + somaImpares);
    }
}

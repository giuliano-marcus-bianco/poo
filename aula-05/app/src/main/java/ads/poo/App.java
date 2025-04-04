package ads.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tamanho da matriz entre 3 e 10: ");
        int tamanho = scanner.nextInt();

        while (tamanho < 3 || tamanho > 10) {
            System.out.println("Tamanho inválido. Escolha um número entre 3 e 10: ");
            tamanho = scanner.nextInt();

        } 
        
        int[][] matriz = new int[tamanho][tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if(i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }    

}

import java.util.Random;
import java.util.Scanner;

public class bigo {
    public static Scanner teclado;
    public static int[][] bingo = new int[4][4];

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
    System.out.println("   JOGO DO BIGO!");
    gerarCartela();
    mostrarCartela();
    sortear();
    }

    public static void gerarCartela() {
    Random r = new Random();

        for(int l = 0; l < 4; l++) {
            for(int c = 0; c < 4; c++) {
                bingo[l][c] = r.nextInt(20) + 1;
            }
        }
    }
    public static void mostrarCartela() {
        for(int l = 0; l < 4; l++) {
            for(int c = 0; c < 4; c++) {
                System.out.printf("%4d", bingo[l][c]);
            }
        System.out.println();
        }
    }
    public static void marcarNumero(int numero) {
        for(int l = 0; l < 4; l++) {
            for(int c = 0; c < 4; c++) {
                if(bingo[l][c] == numero) {
                    bingo[l][c] = 0;
                }
            }
        }
    }
    public static boolean premio1() {
    int contador = 0;
        for(int l = 0; l < 4; l++) {
            for(int c = 0; c < 4; c++) {
                if(bingo[l][c] == 0)
                    contador++;
            }
        }
    return contador >= 5;
    }
    public static boolean premio2() {
    for(int l = 0; l < 4; l++) {
        int marcados = 0;

            for(int c = 0; c < 4; c++) {
                if(bingo[l][c] == 0)
                    marcados++;
            }

            if(marcados == 4)
                return true;
        }

        return false;
    }
    public static boolean premio3() { //fechar coluna
        for(int c = 0; c < 4; c++) {
            int marcados = 0;
            for(int l = 0; l < 4; l++) {
                if(bingo[l][c] == 0)
                    marcados++;
            }
            if(marcados == 4)
            return true;
        }
        return false;
    }
    public static void sortear(){
        Random r = new Random();
        while(true){
            int sorteado = r.nextInt(20) + 1;
            System.out.println("Número sorteado: " + sorteado);
            marcarNumero(sorteado);
            if(premio3()){
                System.out.println("3º prêmio - Coluna completa!");
            break;
            }
            if(premio2()){
                System.out.println("2º prêmio - Linha completa!");
            break;
            }
            if(premio1()){
                System.out.println("1º prêmio - 5 números encontrados!");
            break;
            }
        }

    }
}
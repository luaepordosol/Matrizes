import java.util.Scanner;
import java.util.Random;

public class jogoDaVelha {
    public static char velha[][];
    public static Scanner teclado;
    public static int jogadas;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        velha = new char [3][3];

        char Player = 'X'; //primeiro a jpgar é o X
        int opcao;

    System.out.println("=== JOGO DA VELHA ===");
    System.out.println("1 - Jogador vs Jogador");
    System.out.println("2 - Jogador vs Máquina");
    System.out.print("Escolha: ");
    opcao = teclado.nextInt();
        zerarVelha();
        for (jogadas = 1; jogadas <= 9; jogadas++) {
            imprimeVelha();
            if (opcao == 1) {
                jogar(Player);
            } else {
                if (Player == 'X')
                jogar(Player);      // humano
                    else
                    jogarMaquina();     // computador
                }

        if (verificarVencedor(Player)) {
            imprimeVelha();
            System.out.println("\nJogador " + Player + " venceu!");
        return;
        }

        Player = (Player == 'X') ? 'O' : 'X';
        }
    System.out.println("\nEmpate!");
    System.out.println("Game over!!");
    imprimeVelha();
    }

    public static void jogar(char Player){
        int l,c;
        boolean repetir = true;
    do{
        System.out.printf("\n\nJogador %c informe Linha e Coluna: \n", Player);
        System.out.println("0 = linha '1'");
        l = teclado.nextInt();
        c = teclado.nextInt();
        if(l<3 && c<3){
            if (velha [l][c]== '.'){
                velha [l][c] = Player;
             repetir = false;
            }
            else System.out.println("Jogada inválida, tente novamente...");
        }
            else System.out.println("Jogada inválida (0 ou 1) tente novamente...");
    }while(repetir);
    }

    public static void zerarVelha(){
        int l,c;
        for(l=0; l<3; l++){
            for(c=0; c<3; c++){
            velha[l][c] = '.';
            }
        }
    }
    public static void imprimeVelha(){
        int l,c;
        for(l=0; l<3; l++){
            System.out.println("  ");
            for(c=0; c<3; c++){
                System.out.print(" " + velha[l][c]);
            }
        }
    }
    public static boolean verificarVencedor(char p){

        // linhas
        for(int l = 0; l < 3; l++){
            if(velha[l][0] == p &&
                velha[l][1] == p &&
                velha[l][2] == p)
            return true;
        }

        // colunas
        for(int c = 0; c < 3; c++){
            if(velha[0][c] == p &&
                velha[1][c] == p &&
                velha[2][c] == p)
            return true;
        }

        // diagonais
        if(velha[0][0] == p &&
            velha[1][1] == p &&
            velha[2][2] == p)
        return true;

        if(velha[0][2] == p &&
            velha[1][1] == p &&
            velha[2][0] == p)
        return true;

    return false;
    }
    public static void jogarMaquina(){
    Random r = new Random();
    int l, c;

        do{
            l = r.nextInt(3);
            c = r.nextInt(3);
        }while(velha[l][c] != '.');
        System.out.println("\nMáquina jogou na linha " + l +
                       " e coluna " + c);
    velha[l][c] = 'O';
    }
}




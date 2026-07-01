import java.util.Scanner;

public class notas {
    public static Scanner teclado;
    public static double [][]notas;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        notas = new double[4][6];
        setNotas();
        getNotas();
    }
    public static void setNotas(){
        int l, c;
        for (l=0; l<4; l++){
            System.out.println("\nAluno " + (l + 1));
            for (c = 0; c < 6; c++) {
                System.out.print("Nota da matéria " + (c + 1) + ": ");
                notas[l][c] = teclado.nextDouble();
            }
        }     
    }

    public static void getNotas(){
        double mediaAlunos = 0;
        double somaEscola = 0;
        int l, c; //variavel linha e coluna
        System.out.println("             Nota1  Nota2   Nota3   Nota4   Nota5   Nota6");
        for (l=0; l<4; l++){
            System.out.print("Aluno: " + (l+1));
            for(c=0; c<6; c++){
                System.out.print("     " +notas[l][c]);
                mediaAlunos += notas[l][c];
                somaEscola += notas[l][c];
            }
            mediaAlunos /= 6;
            System.out.printf("   Média: %.2f\n", mediaAlunos);
            System.out.println("\n");
        }
     double mediaEscola = somaEscola / (4 * 6);
    System.out.printf("%nMédia da escola: %.2f%n", mediaEscola);
    }
}
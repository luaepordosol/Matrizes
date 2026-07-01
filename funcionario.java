import java.util.Scanner;
public class funcionario { //fazer pulando linha e nao coluna
    public static Scanner teclado;
    public static int [][]funcionario;

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        funcionario = new int[3][2];
        setDados(); //pega informações
        getDados(); //mostra infos
        
    }

    public static void setDados(){
        int i;
        for (i=0; i<3; i++){
            System.out.println("Informe a idade e o salário do funcionário " + (i+1)+":");
            funcionario[i][0] = teclado.nextInt();
            funcionario[i][1] = teclado.nextInt();
        }
    }
    
    public static void getDados(){
    int l, c;
    System.out.printf("%-15s %-15s %-15s%n",
                      "      ", "Idade", "Salario");

       for (l = 0; l < 3; l++) {
       System.out.printf("%-16s", "Funcionario " + (l + 1));
           for (c = 0; c < 2; c++) {
        System.out.printf("%-16d", funcionario[l][c]);
            }
            System.out.println();
       }
//        System.out.println("             Idade Salário");
//        for (l=0; l<3; l++){
//          System.out.print((l+1) + "º Funcionário: ");
//            for(c=0; c<2; c++){
//                System.out.print("     " + funcionario[l][c]);
//            }
//            System.out.println("\n");
//        }
        }
} 


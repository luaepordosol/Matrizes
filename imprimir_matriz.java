public class imprimir_matriz { 
    public static int [][] notas; //criação matriz global

    public static void main(String[] args) throws Exception {
        //aloca matriz 3 linhas x 4 colunas
        notas = new int[][]{
                //L //C 0 1 2 3
                /*0*/  {2,8,9,7},
                /*1*/  {9,9,6,9},
                /*2*/  {8,7,8,4}};
                notas[1][1]=5; 
                notas[0][0]=8;
        System.out.println((notas[1][1])); 
        imprimeNotas();
    }
    public static void imprimeNotas(){
        int l, c; //variavel linha e coluna
        System.out.println("             Nota1 Nota2 Nota3 Nota4");
        for (l=0; l<3; l++){
            System.out.print((l+1 ) + "º Aluno: ");
            for(c=0; c<4; c++){
                System.out.print("     " +notas[l][c]);
            }
            System.out.println("\n");

        }
    }
} 

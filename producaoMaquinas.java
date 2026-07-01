import java.util.Scanner;

public class producaoMaquinas {
    public static Scanner teclado;
    public static int [][]producao;
     public static String[] dias = {
        "Segunda", "Terça", "Quarta", "Quinta", "Sexta"
    };


    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        producao = new int[2][5];

        setInfo();
        somaPordia();
        somaMaquinas();
        mediaSemanal();
        maiorProd();

    }
    public static void setInfo(){
        int i;
        System.out.println("Programa para armazenar a quantidade de peças!");
        System.out.println("Informe a quantidade produzida por dia de cada máquina: ");
        System.out.println("**Máquina 1**");
        
        for (i = 0; i < dias.length; i++) {
        System.out.print(dias[i] + ":");
        producao[0][i] = teclado.nextInt();
        }
        System.out.println("**Máquina 2**");
        for (i = 0; i < dias.length; i++) {
        System.out.print(dias[i] + ":");
        producao[1][i] = teclado.nextInt();
        }
        System.out.println("\nPRODUÇÃO POR DIA");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n",
        "         Seg", "      Ter", "     Qua", "    Qui", "   Sex");

            for (int maquina = 0; maquina < 2; maquina++) {
                System.out.print("Máquina" + (maquina + 1) + "  ");
                for (int dia = 0; dia < 5; dia++) {
                    System.out.printf("%-10d", producao[maquina][dia]);
                }
                System.out.println();
            }
    }

    public static void somaPordia(){
    System.out.println("SOMA DAS PEÇAS POR DIA");
    int totalM1 = 0;
    int totalM2 = 0;

        for (int dia = 0; dia < 5; dia++) {
        totalM1 += producao[0][dia];
        totalM2 += producao[1][dia];
        }
    System.out.println("Total Máquina 1: " + totalM1);
    System.out.println("Total Máquina 2: " + totalM2);
    }

    public static void somaMaquinas(){
        System.out.println("SOMA DAS DUAS MÁQUINAS POR DIA");
        for (int dia = 0; dia < 5; dia++) {
        int totalDia = 0;
            for (int maquina = 0; maquina < 2; maquina++) {
                totalDia += producao[maquina][dia];
            }
        System.out.println(dias[dia] + ":" + totalDia + " peças");
        }
    }

    public static void mediaSemanal(){
        System.out.println("MÉDIA SEMANAL");
        int soma = 0;
        for (int maquina = 0; maquina < 2; maquina++) {
            for (int dia = 0; dia < 5; dia++) {
                soma += producao[maquina][dia];
            }
        double media = soma / 5.0;
        System.out.println("Média da Máquina " + (maquina + 1) + ": " + media);
        }
    }
    public static void maiorProd(){
        System.out.println("MAIOR PRODUÇÃO");
    int maior = producao[0][0], maiorM = 0, diaMaior = 0;

        for (int maquina = 0; maquina < 2; maquina++) {
            for (int dia = 0; dia < 5; dia++) {
                if (producao[maquina][dia] > maior) {
                    maior = producao[maquina][dia];
                    maiorM = maquina;
                    diaMaior = dia;
                }
            }
        }
    System.out.println("Maior produção foi da máquina " + (maiorM + 1) + " com " + maior + " peças.");
    System.out.println("Dia: " + dias[diaMaior]);
    }
}
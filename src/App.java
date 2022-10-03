import java.util.Scanner;

class list01_atv04 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.print("informe a nota do primeiro bimestre: ");

        nota1 = sc.nextDouble();

        System.out.print("informe a nota do segundo bimestre: ");

        nota2 = sc.nextDouble();

        System.out.print("informe a nota do terceiro bimestre: ");

        nota3 = sc.nextDouble();

        System.out.print("informe a nota do quarto bimestre: ");

        nota4 = sc.nextDouble();

        double media = ((nota1+nota2+nota3+nota4)/4);

        System.out.println("");

        System.out.printf("Sua média bimestral é: %.1f.",media);

        sc.close();
    }
}
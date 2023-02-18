import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        // Questao 01

        Scanner media = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 1;
        double nota3 = 2;
        double nota4 = 3;

        System.out.print("Digite sua primeira nota: ");
        nota1 = media.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        nota2 = media.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        nota3 = media.nextDouble();

        System.out.print("Digite sua quarta nota: ");
        nota4 = media.nextDouble();

        double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Sua média é %.2f", resultado);
*/

/*
        //Questao 02

        Scanner salario = new Scanner (System.in);

        float hora = 0;
        float mes = 1;

        System.out.print("Quanto você ganha por hora: ");
        hora = salario.nextFloat();

        System.out.print("Quantas horas trabalhada no mês: ");
        mes = salario.nextFloat();

        float resultado = hora * mes;

        System.out.printf("O seu salário do mês foi %.2f" ,resultado);

*/

/*
        //Questao 03

        Scanner temperatura = new Scanner (System.in);

        double fahrenheit = 0;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = temperatura.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura em Celsius é %.2f" ,celsius);
*/

/*
        //Questao 04

        Scanner salarioDescontado = new Scanner (System.in);

        float hora = 0;
        float mes = 0;
        double irr = 0.11;
        double insss = 0.08;
        double sindicato = 0.05;
        double salario = 0;

        System.out.print("Quanto você ganha por hora: ");
        hora = salarioDescontado.nextFloat();

        System.out.print("Quantas horas trabalhadas no mês: ");
        mes = salarioDescontado.nextFloat();

        float resultado = hora * mes;

        double ir = resultado * irr;

        double inss = resultado * insss;

        double sindicatoo = resultado * sindicato;

        double salarioLiquido = resultado - ir - inss - sindicato;


        System.out.print("----------------------------------------");
        System.out.printf("\nSeu salário bruto do mês foi: %.2f" , resultado);
        System.out.printf("\nPago ao Imposto de Renda: %.2f" ,ir);
        System.out.printf("\nPago ao INSS: %.2f" ,inss);
        System.out.printf("\nPago ao sindicato: %.2f" ,sindicatoo);
        System.out.printf("\nSalário liquido do mês: %.2f" ,salarioLiquido);

*/

/*
        //Questao 05

        Scanner nota = new Scanner (System.in);

        double nota01 = 0;
        double nota02 = 0;

        System.out.print("Qual sua primeira nota: ");
        nota01 = nota.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        nota02 = nota.nextDouble();

        double resultado = (nota01 + nota02) / 2;

        System.out.printf("Sua média foi: %.2f" ,resultado);

        if (resultado >= 7 && resultado <= 9){
            System.out.print("\nAprovado");
        }
        if (resultado < 7 && resultado >= 1){
            System.out.print("\nReprovado");
        }
        if (resultado == 10){
            System.out.print("\nAprovado com Distinção");
        }
*/

/*
        //Questao 06

        Scanner numero = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        System.out.print("Digite um número: ");
        num1 = numero.nextDouble();

        System.out.print("Digite outro número: ");
        num2 = numero.nextDouble();

        System.out.print("Digite outro número: ");
        num3 = numero.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.printf("O maior número é %.0f", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("O maior número é %.0f", num2);
        } else
            System.out.printf("O maior número é %.0f", num3);

        if (num1 < num2 && num1 < num3) {
            System.out.printf("\nO menor número é %.0f", num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.printf("\nO menor número é %.0f", num2);
        } else
            System.out.printf("\nO menor número é %.0f", num3);

    }
}

/*
        //Questao 07

        Scanner tabuada = new Scanner (System.in);

        int valor = 0;

        System.out.print("Digite o valor da tabuada: ");
        valor = tabuada.nextInt();

        for (int i = 0; i < 11; i++){
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }

*/

import java.util.Scanner;

public class CalculadorDeGastos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a renda anual
        System.out.print("Informe a renda anual: ");
        double rendaAnual = scanner.nextDouble();

        // Solicitar os gastos médicos
        System.out.print("Informe os gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();

        // Solicitar os gastos educacionais
        System.out.print("Informe os gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        // Calcular a renda mensal com base na renda anual
        double rendaMensal = rendaAnual / 12.0;

        // Calcular a dedução total com base nos gastos médicos e educacionais
        double deducaoTotal = gastosMedicos + gastosEducacionais;

        // Calcular o imposto de renda
        double impostoDeRenda = 0.0;

        if (rendaMensal <= 2000) {
            impostoDeRenda = 0;
        } else if (rendaMensal <= 5000) {
            impostoDeRenda = (rendaMensal - deducaoTotal) * 0.1;
        } else {
            impostoDeRenda = (rendaMensal - deducaoTotal) * 0.2;
        }

        // Exibir o relatório de imposto de renda
        System.out.println("Relatório de Imposto de Renda:"+ "0");
        System.out.println("Renda Anual: R$" + rendaAnual+ "0");
        System.out.println("Renda Mensal: R$" + rendaMensal+ "0");
        System.out.println("Gastos Médicos: R$" + gastosMedicos+ "0");
        System.out.println("Gastos Educacionais: R$" + gastosEducacionais+ "0");
        System.out.println("Dedução Total: R$" + deducaoTotal+ "0");
        System.out.println("Imposto de Renda devido: R$" + impostoDeRenda + "0");

        scanner.close();
    }
}






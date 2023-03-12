import java.util.Arrays;

public class Faturamento {
    public static void main(String[] args) {
        double[] faturamentoDiario = { 1500, 2000, 1000, 2500, 1700, 1900, 2200, 0, 0, 0, 0, 0, 0 };
        double somaFaturamento = 0;
        int AcimaDaMedia = 0;

        
        double[] faturamentoDiarioSemZero = Arrays.stream(faturamentoDiario).filter(d -> d > 0).toArray();
        Arrays.sort(faturamentoDiarioSemZero);

        
        double menorFaturamento = faturamentoDiarioSemZero[0];
        double maiorFaturamento = faturamentoDiarioSemZero[faturamentoDiarioSemZero.length - 1];

        
        for (double faturamento : faturamentoDiarioSemZero) {
            somaFaturamento += faturamento;
        }

        double mediaMensalFaturamento = somaFaturamento / faturamentoDiarioSemZero.length;

        for (double faturamento : faturamentoDiarioSemZero) {
            if (faturamento > mediaMensalFaturamento) {
                AcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento diário acima da média: " + AcimaDaMedia);
    }
}

import java.text.DecimalFormat;

public class questao4 {
    
    public static void main(String[] args) {
        
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        double total = sp + rj + mg + es + outros;
        
        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        // Exibição dos resultados
        System.out.println("Percentual de representação do faturamento por estado:");
        System.out.println("SP: " + df.format(percentualSP) + "%");
        System.out.println("RJ: " + df.format(percentualRJ) + "%");
        System.out.println("MG: " + df.format(percentualMG) + "%");
        System.out.println("ES: " + df.format(percentualES) + "%");
        System.out.println("Outros: " + df.format(percentualOutros) + "%");
        
    }
}
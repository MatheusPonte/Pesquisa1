public class InverterString {
    public static void main(String[] args) {
        String str = "Exemplo de string a ser invertida";
        String strInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida += str.charAt(i);
        }

        System.out.println(strInvertida);
    }
}

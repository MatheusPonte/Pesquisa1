import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      

        int INDICE = 13, SOMA = 0, K = 0;

    while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}

   System.out.println(SOMA); // 91

   //questão 2:

   System.out.print("Digite um número inteiro positivo: ");
   int numero = sc.nextInt();

   int anterior = 0;
   int atual = 1;

   while (atual < numero) {
       int proximo = anterior + atual;
       anterior = atual;
       atual = proximo;
   }

   if (atual == numero) {
       System.out.printf("%d pertence à sequência de Fibonacci.", numero);
   } else {
       System.out.printf("%d não pertence à sequência de Fibonacci.", numero);
   }

   
    }

    

  
   
}

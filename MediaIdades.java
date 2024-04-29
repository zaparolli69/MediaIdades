import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        int idade;
        
        System.out.println("Digite as idades (digite 0 para finalizar):");
        
        do {
            idade = scanner.nextInt();
            if (idade != 0) {
                soma += idade;
                contador++;
            }
        } while (idade != 0);
        
        if (contador == 0) {
            System.out.println("Nenhuma idade foi digitada.");
        } else {
            double media = (double) soma / contador;
            System.out.println("A média das idades digitadas é: " + media);
        }
        
        scanner.close();
    }
}

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        while (true) {
            try {    
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
    
                System.out.println("Digite seu sobrenome: ");
                String sobrenome = sc.nextLine();
    
                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();
    
                System.out.println("Digite sua altura: ");
                while (true) {
                    try {
                        double altura = sc.nextDouble();
                        break;
                    } catch (NoSuchElementException e) {
                        System.err.println("Altura deve ser um número decimal. Com uso de ponto (.)");
                        sc.next();
                    }
                }
    
                break;
            } catch (InputMismatchException e) {
                System.err.println("Idade e altura devem ser números inteiros e decimais, respectivamente.");
                sc.next();
        }
        
        sc.close();
    }

    }

    
}
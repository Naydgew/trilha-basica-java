import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
      try{
        //criando o onejto scanner
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite se nome");
      String nome = scanner.next();

      System.out.println("Digite seu sobrenome");
      String sobrenome = scanner.next();

      System.out.println("Digite sua idade");
      int idade = scanner.nextInt();

      System.out.println("Digite sua altura");
      double altura = scanner.nextDouble();

      System.out.println("Olá, me chamo " + nome.toUpperCase() + " " +  sobrenome);
      System.out.println("Tenho " + idade + " anos ");
      System.out.println("Minha altura é " + altura + "cm");
      scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
       
}


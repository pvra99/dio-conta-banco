import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu primeiro nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();
    
        System.out.println("valor do primeiro deposito");
        double deposito = scanner.nextDouble();

        
        System.out.println("Ola :" + nome + " " + sobrenome);
        System.out.println("obrigado por criar uma conta em nosso banco");
        System.out.println("sua agencia é " + agencia);
        System.out.println("conta  " + conta);
        System.out.println("seu saldo é:"+"R$" + deposito + " já está disponível para saque");
    }     
    }


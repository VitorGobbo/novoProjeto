import java.util.Locale;
import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) {
        
      // to do faça a conta com numero da conta, nome de usuario, agencia e saldo   

    Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Qual é a sua conta ?");
        int contaUser = keyboard.nextInt();
    System.out.println("Qual é o seu nome ? ");    
        String nomeUser = keyboard.next();
    System.out.println("Informe sua Agencia por favor !");
        int agenciaUser = keyboard.nextInt();
    System.out.println("informe o seu saldo !!");
        float saldoUser = keyboard.nextFloat();

        System.out.println("Olá " +nomeUser+" sua conta de numero "+contaUser+" foi criada com sucesso na agencia " +agenciaUser+" o seu saldo atual é : "+saldoUser );

        
    
        
    
    }
}

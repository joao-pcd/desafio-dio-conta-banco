import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroCliente = scanner.nextInt();

        System.out.println("Digite o número da agência sem o dígito!!:");
        String agenciaNumero = scanner.next().substring(0, 5);

        System.out.println("Digite o dígito da agência:");
        String agenciadigito = scanner.next().substring(0, 1);

        String agencia = agenciaNumero.concat("-".concat(agenciadigito));

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        //Locale localBrasil = new Locale("pt", "BR");
        System.out.println("Insira o saldo:");
        //String saldo = NumberFormat.getCurrencyInstance(localBrasil).format(scanner.nextDouble());
        String saldo = formatoMoeda.format(scanner.nextDouble());

        System.out.println("Olá ".concat(nomeCompleto) +
                ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) +
                ", conta "+ numeroCliente + " e seu saldo de " + saldo +" já está disponível para saque");

    }
}
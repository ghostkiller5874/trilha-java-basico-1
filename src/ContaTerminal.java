import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o número da Conta !");
		numeroConta = in.nextInt();
		in.nextLine();
		System.out.println("Por favor, digite a Agência !");
		agencia = in.nextLine();
		System.out.println("Por favor, digite seu Nome !");
		nomeCliente = in.nextLine();
		System.out.println("Informe o Saldo !");
		saldo = in.nextDouble();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "+agencia+", "
				+ "conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
		
		in.close();
	}

}

package topekabank;

public class TesteDeOperacoesPix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cliente 1
		Cliente matheus = new Cliente("Matheus", "123123123123", "Professor");
		Endereco matheusEndereco = new Endereco("Lugar nenhum", "Cavaco", 666);
		Conta matheusConta = new Conta();
		
		matheusConta.informacoesCliente = matheus;
		matheusConta.enderecoCliente = matheusEndereco;
		
		matheusConta.cadastro(matheus, matheusEndereco, 001, 13782);
		
		// cliente 2
		
		Cliente jeziel = new Cliente("Jeziel", "000111222333", "Professor");
		Endereco jezielEndereco = new Endereco("Igreja", "Evangelica", 33);
		Conta jezielConta = new Conta();
		
		jezielConta.informacoesCliente = jeziel;
		jezielConta.enderecoCliente = jezielEndereco;
		
		jezielConta.cadastro(jeziel, jezielEndereco, 001, 21234);
		
		// ============================== CADASTRO DE CHAVE PIX
		// Cadastro de chave pix
		System.out.println("-------------- Cadastro de chave pix");
		matheusConta.setChavePix("sasuke@sasuke.com");
		jezielConta.setChavePix("deusefiel@deusefiel.com");
		
		System.out.println(matheusConta.getChavePix());
		System.out.println(jezielConta.getChavePix());
		
		// ============================== DEPOSITO
		// Depósito
		System.out.println("-------------- Depósito");
		matheusConta.deposito(-100);
		
		// ============================== SAQUE
		// Saque
		System.out.println("-------------- Saque");
		matheusConta.saque(81);
		System.out.println("Saldo da conta: R$ " + matheusConta.getSaldo());
		
		jezielConta.saque(150);
		System.out.println("Saldo da conta: R$ " + jezielConta.getSaldo());
		
		// ============================== TRANFERENCIA
		// Tranferencia
		System.out.println("-------------- Tranferencia");
		matheusConta.transferencia(19, jezielConta, "deusefiel@deusefiel.com");
		System.out.println("Saldo da conta: R$ " + jezielConta.getSaldo());
		System.out.println("Saldo da conta: R$ " + matheusConta.getSaldo());
		
		// Valor da tranferência maior do que o saldo
		System.out.println("-------------- Valor da tranferência maior do que o saldo");
		jezielConta.transferencia(120, matheusConta, "sasuke@sasuke.com");
		System.out.println("Saldo da conta: R$ " + jezielConta.getSaldo() + " " + jezielConta.informacoesCliente.getNome());
		System.out.println("Saldo da conta: R$ " + matheusConta.getSaldo() + " " + matheusConta.informacoesCliente.getNome());
		
		// erro de chave pix
		System.out.println("-------------- Erro de chave PIX");
		jezielConta.transferencia(2, matheusConta, "naruto@sasuke.com");
		System.out.println("Saldo da conta: R$ " + jezielConta.getSaldo() + " " + jezielConta.informacoesCliente.getNome());
		System.out.println("Saldo da conta: R$ " + matheusConta.getSaldo() + " " + matheusConta.informacoesCliente.getNome());
	}

}

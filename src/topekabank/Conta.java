package topekabank;

public class Conta {
	private double saldo = 100;
	private int agencia;
	private int numero;
	private String chavePix;
	public Cliente informacoesCliente;
	public Endereco enderecoCliente;
	
	public void cadastro ( Cliente informacoesCliente, Endereco enderecoCliente, int agencia, int numero) {
		this.informacoesCliente =  informacoesCliente;
		this.enderecoCliente = enderecoCliente;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
	public boolean saque(double valor ) {
		if(this.saldo >= valor ) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}
	
	public boolean transferencia(double valor, Conta destino, String chavePix) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			if (destino.chavePix == chavePix) {
				destino.deposito(valor);
			} else {
				System.out.println("Não foi possivel realizar a transferencia, chave invalida. \n");
			}
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}
	
	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}


	/*	
	public String getNome() {
		return this.informacoesCliente.getNome();
	}

	public void setNome(String nome) {
		this.informacoesCliente.setNome(nome);
	}*/
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}

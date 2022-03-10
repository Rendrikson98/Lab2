package topekabank;

public class TesteDeOperacoesPix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente gabriel = new Cliente("Gabriel Roberto", "123456", "Programador");
		
		System.out.println(gabriel.getNome());
		System.out.println(gabriel.getCpf());
		System.out.println(gabriel.getProfissao());
		
		System.out.println("----------------------------");
		
		Endereco gabrielEndereco = new Endereco("rua A", "Bairro B", 01);
		
		System.out.println(gabrielEndereco.getRua());
		System.out.println(gabrielEndereco.getBairro());
		System.out.println(gabrielEndereco.getNum());
		
		System.out.println("----------------------------");
		
		Conta gabrielConta = new Conta();
		
		gabrielConta.informacoesCliente = gabriel;
		gabrielConta.enderecoCliente = gabrielEndereco;
		
		System.out.println(gabrielConta.informacoesCliente.getNome());
		
		gabrielConta.cadastro(gabriel, gabrielEndereco, 0, 0);
		
		System.out.println(gabrielConta.informacoesCliente.getProfissao());
		gabrielConta.informacoesCliente.setProfissao("Mendigo");
		System.out.println(gabrielConta.informacoesCliente.getProfissao());
		System.out.println(gabrielConta.enderecoCliente.getBairro());
		
	}

}

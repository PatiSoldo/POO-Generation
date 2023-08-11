package POO;

public class Cliente {

	private String nomeCliente;
	private int idade;
	private String email;
	private String telefone;
	private String endereco;
	
	public Cliente(String nomeCliente, int idade, String email, String telefone, String endereco) {
		super();
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getCpf() {
		return idade;
	}
	public void setCpf(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome: "+nomeCliente);
		System.out.println("Idade: "+idade);
		System.out.println("E-mail: "+email);
		System.out.println("Telefone: "+telefone);
		System.out.println("Endereço: "+endereco);
	
	}
}

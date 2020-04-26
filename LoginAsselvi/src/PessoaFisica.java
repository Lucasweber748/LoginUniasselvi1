
public class PessoaFisica extends Pessoa {
protected String cpf;
	
	public PessoaFisica () {
		super ();
		this.cpf = "";
		

	}

	public String getCPF() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
}

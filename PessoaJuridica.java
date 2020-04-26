
public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica () {
		super();
		this.cnpj = "";
	}

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	}


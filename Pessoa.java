
public abstract class Pessoa {

	private String nome;
		 protected String login;
		 protected String senha;
		 
		 void validarsenha() {
				if(login.equals("121214") && senha.equals("121212")){
			        System.out.printf("Usu�rio %s logado com sucesso.", login);
			    }else{
			        System.out.println("Login ou senha inv�lidos!");
			    }
		 }

		 
		public String getLogin() {
			return login;
		}


		public void setLogin(String login) {
			this.login = login;
		}


		public String getSenha() {
			return senha;
		}


		public void setSenha(String senha) {
			this.senha = senha;
		}


		public Pessoa () {
			this.nome = "";
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}
		}




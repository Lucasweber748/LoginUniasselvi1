public class Comunidade extends PessoaFisica {

	void validarsenha() {
		if(login.equals("121214") && senha.equals("121212") && cpf.equals("09026415907")){
	        System.out.printf("Usuário %s logado com sucesso.", login);
	        System.out.println("\nBem vindo Usuario"
	    			+ "\nVoce será direcionado para a pagina de acesso");
	    }else{
	        System.out.println("Login,senha ou CPF inválidos!");
	    }
}
}
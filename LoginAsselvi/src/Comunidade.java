public class Comunidade extends PessoaFisica {

	void validarsenha() {
		if(login.equals("121214") && senha.equals("121212") && cpf.equals("09026415907")){
	        System.out.printf("Usu�rio %s logado com sucesso.", login);
	        System.out.println("\nBem vindo Usuario"
	    			+ "\nVoce ser� direcionado para a pagina de acesso");
	    }else{
	        System.out.println("Login,senha ou CPF inv�lidos!");
	    }
}
}
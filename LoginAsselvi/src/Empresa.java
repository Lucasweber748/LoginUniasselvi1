
public class Empresa extends PessoaJuridica {
	
	void validarsenha() {
		if(login.equals("141414") && senha.equals("747474")){
	        System.out.printf("Usu�rio %s logado com sucesso.", login);
	    }else{
	        System.out.println("Login ou senha inv�lidos!");
	    }
 }
}


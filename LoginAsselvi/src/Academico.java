
public class Academico extends PessoaFisica {

void validarsenha() {
	if(login.equals("1288970") && senha.equals("112233")){
        System.out.printf("Usu�rio %s logado com sucesso.", login);
        System.out.println("\nBem vindo Academico Lucas"
    			+ "\nVoce � da turma INF0191 - SISTEMAS DE INFORMA��O");
	}else{
        System.out.println("Login ou senha inv�lidos!");
    }
}
}

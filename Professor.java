
public class Professor extends PessoaFisica {
private String materia_leciona;

public String getMateria_leciona() {
	return materia_leciona;
}

public void setMateria_leciona(String materia_leciona) {
	this.materia_leciona = materia_leciona;
}

void validar() {
	if(login.equals("121214") && senha.equals("121212") && cpf.equals("44455566600")){
        System.out.printf("Usuário %s logado com sucesso.", login);
        System.out.println("\nBem vindo Professor Everton"
    			+ "\nVoce leciona a Materia de Programação Orientada a objetos");
	}else{
        System.out.println("Login,senha ou CPF inválidos!");
    }



}



}


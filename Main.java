import java.util.Scanner;
public class Main {
static Scanner sc = new Scanner(System.in);
static int op��o;
static String login;
static String senha;
static String cpf;

public static void main(String[] args) {
System.out.println("Digite os Seguintes numeros para entrar nas op�oes abaixo:"
		+ "\n1 - Academico"
		+ "\n2 - Academico Sala Virtual"
		+ "\n3 - Colaborador"
		+ "\n4 - Empresa"
		+ "\n5 - Comunidade"
		+ "\n");
op��o = sc.nextInt();


switch (op��o) {
case 1:
Academico academico = new Academico();
System.out.println("Login:");
System.out.println("Senha:");
login = sc.next();
senha = sc.next();
academico.setLogin(login);
academico.setSenha(senha);
academico.validarsenha();
break;

case 2:
AcademicoSalaVirtual virtual = new AcademicoSalaVirtual();
virtual.Direcionamento();
break;


case 3:
Professor professor = new Professor();
System.out.println("Login:");
System.out.println("Senha:");
System.out.println("CPF:");
login = sc.next();
senha = sc.next();
cpf = sc.next();
professor.setLogin(login);
professor.setSenha(senha);
professor.setcpf(cpf);
professor.validar();

break;



case 4:
Empresa empresa = new Empresa();
System.out.println("Login:");
System.out.println("Senha:");
login = sc.next();
senha = sc.next();
cpf = sc.next();
empresa.setLogin(login);
empresa.setSenha(senha);
empresa.setCNPJ(cpf);
empresa.validarsenha();
break;

case 5:
Comunidade comunidade = new Comunidade();
System.out.println("Login:");
System.out.println("Senha:");
System.out.println("CPF:");
login = sc.next();
senha = sc.next();
cpf = sc.next();
comunidade.setLogin(login);
comunidade.setSenha(senha);
comunidade.setcpf(cpf);
comunidade.validarsenha();
break;
}






	}

}

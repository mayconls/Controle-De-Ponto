package Controle;

public class GerenciarControlePonto {

	    public static void main(String[] args) throws InterruptedException{

	        Gerente g1 = new Gerente();
	        g1.setIdFunc(001);
	        g1.setNome("Gerente Maycon");
	        g1.setEmail("maycon04@hotmail.com");
	        g1.setDocumento("CPF 163.456.789-00");
	        g1.setLogin("Mayconls");
	        g1.setSenha("Maycon478");

	        Secretaria s1 = new Secretaria();
	        s1.setIdFunc(002);
	        s1.setNome("Secretaria Maria");
	        s1.setEmail("maria@hotmail.com");
	        s1.setDocumento("CPF 234.567.890-11");
	        s1.setTelefone("19-3000-0001");
	        s1.setRamal("3211");

	        Operador o1 = new Operador();
	        o1.setIdFunc(003);
	        o1.setNome("Operador José");
	        o1.setEmail("josé@hotmail.com");
	        o1.setDocumento("CPF 555.444.333-22");
	        o1.setValorHora(7.50);

	        RegistroPonto rp1 = new RegistroPonto();
	        rp1.setFun(g1);
	        rp1.setDataRegistro(java.time.LocalDate.now());
	        rp1.setHoraEntrada(java.time.LocalDateTime.now());
	        Thread.sleep(10000);
	        rp1.setHoraSaida(java.time.LocalDateTime.now());
	        rp1.apresentarRegistroPotno();

	        RegistroPonto rp2 = new RegistroPonto();
	        rp2.setFun(s1);
	        rp2.setDataRegistro(java.time.LocalDate.now());
	        rp2.setHoraEntrada(java.time.LocalDateTime.now());
	        Thread.sleep(10000);
	        rp2.setHoraSaida(java.time.LocalDateTime.now());
	        rp2.apresentarRegistroPotno();

	        RegistroPonto rp3 = new RegistroPonto();
	        rp3.setFun(o1);
	        rp3.setDataRegistro(java.time.LocalDate.now());
	        rp3.setHoraEntrada(java.time.LocalDateTime.now());
	        Thread.sleep(10000);
	        rp3.setHoraSaida(java.time.LocalDateTime.now());
	        rp3.apresentarRegistroPotno();
	        }

	}

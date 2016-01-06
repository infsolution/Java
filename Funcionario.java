class Funcionario{
	String nome;
	String departamento;
	Data admicao= new Data();
	String rg;
	String cpf;
	double salario;

	void recebeAumento(double aumento){
		this.salario+=aumento;
	}
	double calculaGanhoAnual(){
		double ganho=this.salario*12;
		return ganho;
	}
	void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Data de adminição: "+this.admicao);
		System.out.println("RG: "+this.rg);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Salário: "+this.salario);
		System.out.println("Ganho anual: "+this.calculaGanhoAnual());
		System.out.println("Dia: "+admicao.datFormat());
		
	}
}
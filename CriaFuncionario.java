public class CriaFuncionario{
public static void main(String []args){
Funcionario f1 = new Funcionario();
Funcionario f2 = new Funcionario();
Data data = new Data();
System.out.println();
f1.mostra();
f1.nome="Cicero";
f1.salario = 880.00;

f2.nome="Cicero";
f2.salario = 1300.00;

if(f1==f2){
	System.out.println("iguais.");
}else{
	System.out.println("diferentes.");
}
f2=f1;
if(f1==f2){
	System.out.println("iguais.");
}else{
	System.out.println("diferentes.");
}
	}

}
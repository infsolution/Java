class Data{
	int dia;
	int mes;
	int ano;
	
	String datFormat(){
		String dia = Integer.toString(this.dia);
		String mes  = Integer.toString(this.mes);
		String ano = Integer.toString(this.ano);
		String dat = dia+"-"+mes+"-"+ano;
		return dat;
	}
}
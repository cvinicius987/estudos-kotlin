package cap3.local_function

class Company(val name:String, val add:String)

fun saveCompany(company:Company) {}

fun Company.validate(){
	
	fun validate(value:String, field:String){
		
		if(value.isEmpty()){
			throw IllegalArgumentException("Company invalida, o campo $field esta vazio.")
		}
	}
	
	validate(this.name, "Name")
	validate(this.add, "Endereco")
}

fun main(args: Array<String>) {
	
	val cli = Company("JetBrains", "")
	
	cli.validate() 
	
	saveCompany(cli)
}
package pl.zzpj2020.solid.isp.contactbook.solution;

class InterfaceSegregationPrinciple {
	
	Emailer emailer;
	Dialler dialler;
	
	public InterfaceSegregationPrinciple() {
		emailer = new Emailer();
		dialler = new Dialler();
	}
	
	public static void main(String[] args) {

		InterfaceSegregationPrinciple interfaceSegregationPrinciple = new InterfaceSegregationPrinciple();
		interfaceSegregationPrinciple.contactPeople();
		
	}
	
	public void contactPeople() {
		
		EmailContact emailContact = new EmailContact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com");
		TelephoneContact telephoneContact = new TelephoneContact("Jan Kowalski", "Kielce", "83744-23434");
		emailer.sendMessage(emailContact, "promocja", "tanio dzisiaj!");
		dialler.makeCall(telephoneContact);
	}
	

}

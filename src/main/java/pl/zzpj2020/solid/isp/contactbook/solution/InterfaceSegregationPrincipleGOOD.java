package pl.zzpj2020.solid.isp.contactbook.solution;

class InterfaceSegregationPrincipleGOOD {
	
	Emailer emailer;
	Dialler dialler;
	
	public InterfaceSegregationPrincipleGOOD() {
		emailer = new Emailer();
		dialler = new Dialler();
	}
	
	public static void main(String[] args) {
		
		InterfaceSegregationPrincipleGOOD interfaceSegregationPrinciple = new InterfaceSegregationPrincipleGOOD();
		interfaceSegregationPrinciple.contactPeople();
		
	}
	
	public void contactPeople() {
		Email email = new EmailContact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com");
		Phone phone = new PhoneContact("Jan Kowalski", "Kielce","83744-23434");
		emailer.sendMessage(email, "promocja", "tanio dzisiaj!");
		dialler.makeCall(phone);
	}
	

}

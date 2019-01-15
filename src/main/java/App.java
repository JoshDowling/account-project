
public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		Account josh = new Account("Josh", "Dowling", 1);
		Account joel = new Account("Joel", "Halford", 2);
		
		Service newService = new Service();
		newService.addAccount(josh);
		newService.addAccount(joel);
		
		newService.getAccounts();
	}
}

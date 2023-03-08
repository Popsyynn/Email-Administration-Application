package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email e1 = new Email("Popoola" , "Olaitan");
		e1.setAlternateEmail("popsyynn@gmail.com");
		System.out.println("Alternate email address: " + e1.getAlternateEmail());
		
		e1.showInfo();
		System.out.println("Alternate Email: " + e1.getAlternateEmail());
		
		}
	

}

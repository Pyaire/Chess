package TD05;

public class RegistredLetter extends Mail{

	private String format = "";
	
	public RegistredLetter(double poids, boolean direct, String adresse, String taille) {
		super(poids, direct, adresse);
		format = taille;
	}
	
	@Override
	public double frank() {
		double amount = 0.0;
		if(super.frank() != 0) {
			if(this.format.equals("A4")) amount = 2.0;
			else amount = 3.0;
			amount += this.getWeight()/100;
		}
		if(this.express) amount = amount * 2;
		return amount;
	}
	
	
	@Override
	public String toString() {
		String s = super.toString();
		s+= "\n\tFormat : " + format;
		return s;
	}
	
//	public static void main(String[] args) {
//		RegistredLetter lettre = new RegistredLetter(400.0,true, "coucou", "A5");
//		RegistredLetter lettre2 = new RegistredLetter(200.0,false, "", "A4");
//		System.out.println(lettre.toString());
//		System.out.println(lettre2.toString());
//	}
	
	
	
	
	
	
	
}

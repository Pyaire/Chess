package TD05;

public class Mail {
	
	public final static double BASIS = 1.5;
	private double weight;
	protected boolean express;
	private String address;
	
	public Mail(double poids, boolean direct, String adresse) {
		weight = poids;
		express = direct;
		address = adresse;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public boolean isValid() {
		return this.address!=null && this.address.length() > 0;
	}
	
	public double frank() {
		if (!this.isValid()) return 0.0;
		if (express) return BASIS*2;
		return BASIS;
	}
	
	public String toString() {
		
		String s = "Mail";
		String nl = "\n\t"; //new line, retour à la ligne
		if (!this.isValid()) s+= " (invalid)";
		s+= nl + "Weight : " + weight + " grammes";
		s+= nl + "Express : ";
		if (express) s+= "yes";
		else s+= "no";
		s+= nl + "Destination : " + address;
		s+= nl + "Price : " + this.frank() + "euros";
		
		return s;
	}	
}
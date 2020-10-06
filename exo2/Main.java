package exo2;

public class Main {
	public static void main(String [] args) {
		File file1 = new File();
		Producteur p1 = new Producteur(file1);
		Thread t1 = new Thread(p1);
		Consommateur c1 = new Consommateur(file1);
		Thread t2 = new Thread(c1);
		t2.start();
		t1.start();
	}
}

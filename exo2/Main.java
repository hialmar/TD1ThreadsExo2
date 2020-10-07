package exo2;

public class Main {
	public static void main(String [] args) {
		// 1 file, 1 producteur et 2 consommateurs
		File file1 = new File();
		Producteur p1 = new Producteur(file1);
		Thread t1 = new Thread(p1);
		Consommateur c1 = new Consommateur(file1);
		Thread t2 = new Thread(c1);
		Consommateur c2 = new Consommateur(file1);
		Thread t3 = new Thread(c2);
		t2.start();
		t3.start();
		t1.start();
		// 1 file, 2 producteurs et 1 consommateur
		File file2 = new File();
		Producteur p2 = new Producteur(file2);
		Thread t4 = new Thread(p2);
		Consommateur c3 = new Consommateur(file2);
		Thread t5 = new Thread(c3);
		Producteur p3 = new Producteur(file2);
		Thread t6 = new Thread(p3);
		t6.start();
		t5.start();
		t4.start();
	}
}

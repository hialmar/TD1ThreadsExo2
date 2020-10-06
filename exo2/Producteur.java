package exo2;

public class Producteur implements Runnable {
    private static final int MAXMESSAGES = 50;
    private int nbMessage;
	private File maFile;
    
	public Producteur(File maFile) {
		super();
		this.maFile = maFile;
	}

	public void run(){
        try {
            while (nbMessage < MAXMESSAGES) {
            	maFile.insererMessage();
                System.out.println("Message numero "+nbMessage+" produit");
                nbMessage++;
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {}
    }
}

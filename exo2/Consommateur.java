package exo2;

public class Consommateur implements Runnable {
	private static final int MAXMESSAGES = 50;
    private int nbMessage;
	private File maFile;
	
	public Consommateur(File maFile) {
		super();
		this.maFile = maFile;
	}

	public void run() {
		try {
            while (nbMessage < MAXMESSAGES) {
                String message = maFile.recupererMessage();
                System.out.println("Message numero "+nbMessage+" recu : " +message);
                nbMessage++;
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {}
	}
}

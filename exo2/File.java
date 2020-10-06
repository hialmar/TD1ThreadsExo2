package exo2;

import java.util.ArrayList;

public class File {
	private static final int MAXFILE = 5;
	private ArrayList<String> messages = new ArrayList<>();
	
	public synchronized void insererMessage () {
        while (messages.size() == MAXFILE) {
            System.out.println("File pleine");
            try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
 
        messages.add(new java.util.Date().toString());
        this.notify();
    }
	
    public synchronized String recupererMessage() {
        while (messages.size() == 0) {
            System.out.println("File vide");
            try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        String message = (String)messages.get(0);
        messages.remove(0);
        this.notify();
        return message;
    }
}

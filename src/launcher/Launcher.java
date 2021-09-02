package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student student = new Student(777, "Leal", "Dario", "l.dario.a@gmail.com", "https://github.com/daro-all", "/images/me.jpg");
            	
            	//Creación del JFrame:
            	SimplePresentationScreen sps = new SimplePresentationScreen(student);

            	sps.setVisible(true);
            }
        });
    }
}
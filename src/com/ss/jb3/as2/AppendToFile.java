/**
 * 
 */
package com.ss.jb3.as2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author trevor
 *
 */
public class AppendToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppendToFile aTF = new AppendToFile();
		aTF.display();
	}
	
	public void display() {
		String text = "in a land, far, far away...";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("resources/testDoc.txt", true))) {
			bw.newLine();
			bw.write(text);
			bw.close();
			System.out.println("Done!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}

/**
 * 
 */
package com.ss.jb3.as3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author trevor
 *
 */
public class CharacterCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CharacterCounter cC = new CharacterCounter();
		System.out.print(cC.readFile());
		char search = cC.getUserInput();
		System.out.println("This is how many of the letter '" + search + "' there are: " + cC.countCharacter(cC.readFile(), search));
	}
	
	public char getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a character to search for: ");
		char searchTerm = sc.next().charAt(0);
		sc.close();
		return searchTerm;
	}
	
	public String readFile() {
		String text = null;
		try (BufferedReader br = new BufferedReader(new FileReader("resources/testDoc.txt"))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			text = sb.toString();
			return text;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public int countCharacter(String line, char searchTerm) {
		int count = 0;
		for (int i = 0; i< line.length(); i++) {
			if (line.charAt(i) == searchTerm) {
				count++;
			}
		}
		return count;
	}

}

/**
 * 
 */
package com.ss.jb3.as1;

import java.io.File;

/**
 * @author trevor
 *
 */
public class GetFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GetFiles gF = new GetFiles();
		String path = "/home/trevor/Music";
		File directory = new File(path);
		if (directory.exists() && directory.isDirectory()) {
			File arr[] = directory.listFiles();
			gF.retrieveFiles(arr, 0);
		}
	}

	public void retrieveFiles(File[] arr, int tabs) {
		for (File f : arr) {
			for (int i = 0; i < tabs; i++) {
				System.out.print("\t");
			}
			if (f.isFile()) {
				System.out.println(f.getName());
			} else if (f.isDirectory()) {
				System.out.println("[" + f.getName() + "]");
				retrieveFiles(f.listFiles(), tabs + 1);
			}
		}
	}
}

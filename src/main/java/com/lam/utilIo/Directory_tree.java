/**
 * 
 */
package com.lam.utilIo;

import java.io.File;
/**
 * @author lazuajemolle
 *
 */
public class Directory_tree {
private static final String SPACE = "  ";
	/**
	 * @param args
	 */
	public static void main( String[] args ) {
         if (args.length != 1 ) {
        	System.err.println("Uso: Directory_tree.class any_dir");
        	System.exit(4);
         };
         print (new File(args[0]), "");
	};

	private static void print( File file, String indent ) {
       System.out.print(indent);    		
       System.out.println(file.getName());
       if (file.isDirectory()) {
    	 print(file.listFiles(), indent + SPACE);  
       };
	}

	/**
	 * @param files
	 * @param string
	 */
	private static void print( File[] files, String indent ) {
		for (int i = 0; i < files.length; i++) {
			print(files[i], indent );
		};  
		
	};

}

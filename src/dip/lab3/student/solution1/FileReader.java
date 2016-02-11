/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Emilio
 */
import java.io.*;
public class FileReader implements Input{

    @Override
    public String inputText() {
        File input = new File(File.separator + "text.txt");
        
        BufferedReader in = null;
        String text = null;
        
        try {
			if ( input.exists() ){
				// make sure we differentiate between java.io.FileReader
				// class and this custom FileReader class
				in = new BufferedReader( new java.io.FileReader(input) );
				input = in.readLine();
				in.close();
			} else {
				System.out.println("File not found - data.txt");
				input = null;
			}
		} catch (IOException ioe) {
			try {
				if( in != null ) in.close();
			} catch(IOException ioe2) {
				System.out.println( ioe2.getMessage() );
			}
			System.out.println( ioe.getMessage() );
			System.exit(1);  // 1 = signals program end with error
		}
    }
    
}

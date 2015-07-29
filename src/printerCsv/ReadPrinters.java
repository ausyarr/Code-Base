/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printerCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;



/**
 *
 * @author Ausyarr
 */
public class ReadPrinters {

    /**
     *
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String PrinterRead() throws IOException{
        File file1 = new File("test1.txt");
	File file2 = new File("test1-copy.txt");
        //FileUtils.copyFile(file1, file2);
        return null; 
    }
    
}

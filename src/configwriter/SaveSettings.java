/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Ausyarr
 */
public class SaveSettings {
    public static String FileSave(String localhost, String key) throws FileNotFoundException, IOException{
        Properties properties = new Properties();
        properties.setProperty(key, localhost);
        properties.setProperty("VERSION", "0.02");
        
        File file = new File("config.properties");
	FileOutputStream fileOut = new FileOutputStream(file);
	properties.store(fileOut, "Application Settings");
	fileOut.close();
        return null;
    }
}

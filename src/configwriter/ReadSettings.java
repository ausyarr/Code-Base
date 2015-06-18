/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configwriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadSettings {
    public static String FileRead(String key) throws FileNotFoundException, IOException {
        File file = new File("config.properties");
	FileInputStream fileInput = new FileInputStream(file);
	Properties properties = new Properties();
	properties.load(fileInput);
	fileInput.close();
        
        return properties.getProperty(key); 
        
    }
}

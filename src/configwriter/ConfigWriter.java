/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configwriter;

import java.io.IOException;

/**
 *
 * @author Ausyarr
 */
public class ConfigWriter {
    public static void main(String[] args) throws IOException {
        String out = ReadSettings.FileRead("HOST");
        System.out.print(out);
    }
    
}

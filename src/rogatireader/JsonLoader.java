/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogatireader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.*;

/**
 *
 * @author busat
 */
public class JsonLoader {
    
    public static String getJSONString(File file) throws FileNotFoundException, IOException{
        String result = "";
	  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String string;
        while ((string = br.readLine()) != null) 
          result += string;
        
        return result;
    }
    
    public static void main(String[] args){
        
        /**/
        try{
            File file = new File("C:\\Users\\busat\\Documents\\NetBeansProjects\\RogatiReader\\rogati_3_2020.json");
            String jsonString = getJSONString(file);
            JSONObject obj = new JSONObject(jsonString);
            JSONArray arr = obj.getJSONArray("list");

            for (int i = 0; i < arr.length(); i++)
            {
                JSONObject userJSONObj = (JSONObject) arr.get(i);
                System.out.println (userJSONObj.getString("name"));
            }
        }catch(FileNotFoundException fne){
            fne.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}

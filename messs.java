
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class messs{

    public static void main(String args[]){
        
        FileIO reader = new FileIO();
        Scanner scan = new Scanner(System.in);
 
        String[] inputs = reader.load("C:/Users/Sony/Documents/dictnew.csv");    //Reading the File as a String array
        
        for(int i=0;i<inputs.length;i++){
            System.out.println(inputs[i]);//loop for array
      	}
        
        ArrayList<String> myarr = new ArrayList(Arrays.asList(inputs));//put it into an array list
        
        
        
        
        try{
            reader.save("C:/Users/Sony/Documents/di.txt",inputs);
        }catch (Exception e){
            System.out.println(e.getClass());
        }
    }
}
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class another{

    public static void main(String args[]){
        
        FileIO reader = new FileIO();
        Scanner scan = new Scanner(System.in);
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 9 random letters");
        String letters = new String();
        letters=sc.nextLine();
        char[] chararray = new char[9];
        chararray = letters.toCharArray();
        
        char[] chararray8 = new char[9];
        chararray8 = letters.toCharArray();
        
        ArrayList <Character> mylist = new ArrayList<Character>();
        Arrays.sort(chararray);
        String output = null;
         
        
        String[] inputs = reader.load("C:/Users/Sony/Documents/dictnew.csv");//collection of nine or less letters
        String[] ninel = reader.load("C:/Users/Sony/Documents/nineletter.csv");//collection of 9 letters only

        for(int n=0;n<ninel.length;n++)//loop to go through string array
        {
        	String word = ninel[n].trim();//the word is equal to the string of index n and trim off space at the end
        	char[] char1 = word.toCharArray();//create char array and put the word into it
        	Arrays.sort(char1);//sort the array alphabetically
        	
	        	if(Arrays.equals(char1, chararray))//if the letters inputed match the sorted array
	        	{
	        		System.out.println("here is a nine letter word: "+word);//print the word	
	        	}
        		
        	   	
        }
        
		for(int x=0;x<inputs.length;x++)
		{
			String words = inputs[x].trim();//the word is equal to the string of index n and trim off space at the end
        	char[] char8 = words.toCharArray();//create char array and put the word into it
			for(int i = 0;i<char8.length;i++)//go through chars in words
			{
				mylist.add(char8[i]);//add the char at position [i] to the list 
				if(Arrays.asList(mylist).contains(chararray8[i]))//if my list has the letter of one of the input letters
				{
					
					mylist.remove(i);
				}
				
			 }
			if(mylist.isEmpty())//if list is empty then all letters have been removed
			{
			   System.out.println("Here are matches for your letters: "+words);//print my string
			}
		}
        
        
        try{
            reader.save("C:/Users/Sony/Documents/di.txt",inputs);
        }catch (Exception e){
            System.out.println(e.getClass());
        }
    }
    		
    	 
}
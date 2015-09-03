import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class messytwo{

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
        StringBuilder sb = new StringBuilder();
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
			Arrays.sort(char8);
			for(int i = 0;i<char8.length;i++)//go through chars in word
			{
				for(int z = 0; z<chararray8.length;z++)//go through chars in letters
				{
					 if(char8[i]==chararray8[z])//if char at i in word is the same as char in letters then add to my list
					{
						mylist.add(char8[i]);//add the char at position [i] to the list 
						sb.append(char8[i]);//add the list to a string builder
						output=sb.toString();//convert string builder to String
						break;
						
					}
				}
			 }
			if(Arrays.equals(char8, chararray8))//if String is equal to the word
			{
			   System.out.println("Here are matches for your letters: "+output);//print my string
			}
		}
        
        
        try{
            reader.save("C:/Users/Sony/Documents/di.txt",inputs);
        }catch (Exception e){
            System.out.println(e.getClass());
        }
    }
    		
    	 
}
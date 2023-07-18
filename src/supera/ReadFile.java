package supera;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	
	public static ArrayList<Integer> readFile (String fileLocation){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		try {
		      File myObj = new File(fileLocation);
		      Scanner myReader = new Scanner(myObj);
		      myReader.nextLine(); //Ignora a primeira linha, já que estou usando arraylist
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        numbers.add(Integer.parseInt(data));
		        //System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException error) {
		      System.out.println("An error occurred.");
		      error.printStackTrace();
		    } catch (NumberFormatException error) {
		      System.out.println("A digit could not be converted to number.");
			  error.printStackTrace();
		    }
		
		return numbers;
	}

}

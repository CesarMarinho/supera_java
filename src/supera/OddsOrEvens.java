package supera;

import java.util.ArrayList;

public class OddsOrEvens {
	
	public static void Run(String path) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		ArrayList<Integer> evens = new ArrayList<Integer>();
		ArrayList<Integer> odds = new ArrayList<Integer>();
		
		numbers = ReadFile.readFile(path);
		
		for(Integer i : numbers) {
			if(i % 2 == 0) {
				evens.add(i);
			}else {
				odds.add(i);
			}
		}
		
		evens = BubbleSort(evens);
		odds = BubbleSort(odds);
		
		for(Integer i : evens) System.out.println(i);
				
		for(int i = odds.size()-1; i > 0; i--) {
			System.out.println(odds.get(i));
		}
		
	}
	
	public static ArrayList<Integer> BubbleSort(ArrayList<Integer> numbers){
		
		//ArrayList<Integer> listaOrdenada = new ArrayList<Integer>();
		int aux = 0;
		for (int i = 0; i < numbers.size(); i++) {
			
			for (int j = 0; j < numbers.size() - 1; j++) {
				
				if(numbers.get(j) > numbers.get(j + 1)) {
					aux = numbers.get(j);
					numbers.set(j, numbers.get(j + 1));
					numbers.set(j+1, aux);
				}		
				
			}		
			
		}		
		
		return numbers;
		
	}
 
}

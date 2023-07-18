package supera;

public class Pairs {
	
	public static void Run() {
		
		int[] valores = {1, 5, 4, 3, 2};
		int alvo = 2;
		int count = 0;
		
		for(int i = 0; i < valores.length; i++) {
			for(int j = i; j < valores.length; j++) {
				if((valores[i] - valores[j] == alvo) || (valores[j] - valores[i] == alvo) ) count++;
			}
		}
		
		System.out.println(count);
		
		
	}

}

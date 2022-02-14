package Chapter7;

public class AlphabersArray {

	public static void main(String[] args) {
		int alphabets[][] = new int[13][2];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch ++;
				System.out.println((char)alphabets[i][j]);
				
			}
		}
	}

}

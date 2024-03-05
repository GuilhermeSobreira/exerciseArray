package vetor02;

public class SomarNumeros {
	public int numeros (int[]num) {
		int somar = 0;
		
		for (int n : num) {
			somar += n;
		}
		return somar;
	}

}

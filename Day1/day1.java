public class day1 {

	public static void main (String args[] ){
		String line;
		double freq = 0;
		while(!StdIn.isEmpty()){
			line = StdIn.readLine();
			double toAdd = Double.parseDouble(line);
			freq += toAdd;
		}
		
		System.out.println(freq);
	

	}
}

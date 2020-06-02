import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class figurinhas {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> clista = new ArrayList<Integer>();
		ArrayList<Integer> tlista = new ArrayList<Integer>();
		int total = 0;
		String[] n = ler.readLine().split(" ");
		int c = Integer.parseInt(n[1]);
		int t = Integer.parseInt(n[2]);
		n = ler.readLine().split(" ");
		for(int i=0;i<c;i++){
			clista.add(Integer.parseInt(n[i]));
		}
		n = ler.readLine().split(" ");
		for(int i=0;i<t;i++){
			tlista.add(Integer.parseInt(n[i]));
		}
		for (Integer i : clista) {
			if(tlista.contains(i)){
				total++;
			}
		}
		System.out.println(c-total);
	}
}

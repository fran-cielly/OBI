import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class compensação{

	public static void main(String[] args) throws IOException {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		String[] n = ler.readLine().split(" ");
		int n1 = Integer.parseInt(n[0]);
		int n2 = Integer.parseInt(n[1]);
		int ganha = 0, perde = 0, maior = 0;
		for(int i=0;i<n1;i++){
			n = ler.readLine().split(" ");
			if(Integer.parseInt(n[1])>maior){
				maior = Integer.parseInt(n[1]);;
			}
			ganha+= Integer.parseInt(n[1]);
			perde-= Integer.parseInt(n[1]);
		}
		if(ganha/2>=maior){
			System.out.println("S\n"+6);
		}else{
			System.out.println("N\n"+6);
		}
	}
}
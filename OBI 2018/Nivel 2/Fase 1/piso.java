import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class piso{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(ler.readLine());
		int l = Integer.parseInt(ler.readLine());
		System.out.println(((c*l)+((c-1)*(l-1)))+"\n"+(((c-1)*2)+((l-1)*2)));
	}
}

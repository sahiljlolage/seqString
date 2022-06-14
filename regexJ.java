import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class regexJ {
	public static void main(String a[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String str1 = br.readLine();
			String str2 = br.readLine();
			System.out.println(checkSubstring(str1, str2));
		}
	}

	private static String checkSubstring(String str1, String str2) {
		if(str2.contains(str1) || str2.contains(new StringBuilder(str1).reverse().toString())) {
			return "YES";
		}
		return "NO";
	}
}

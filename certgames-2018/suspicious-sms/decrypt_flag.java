import java.util.Base64;
public class Decrypt {

    public static void main(String[] args) {
		String input = "fhtzFmsHOj1CengWWgl5On15eC0=";

		String paramString = new String(Base64.getDecoder().decode(input));
		int i = paramString.length();
		char[] arrayOfChar = new char[i];
		int j = i - 1;
		for (i = j;; i = j)
		{
		  int k=0;
		  if (j >= 0)
		  {
		    j = paramString.charAt(i);
		    k = i - 1;
		    arrayOfChar[i] = ((char)(j ^ 0x49));
		    if (k >= 0) {}
		  }
		  else
		  {
		    System.out.println(arrayOfChar);
			return;
		  }
		  j = k - 1;
		  arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0xA));
		  System.out.println(arrayOfChar);
		}
    }

}


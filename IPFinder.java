Package chapter 02;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UrlChecker{
	public static void main (String[] args){
		Pattern Mypattern = Pattern.compile("^((https?|ftp)://|(www|ftp)\\.)[a-z0-9-]
		+[a-z0-9-]+[a-z]+)+([/?].*)?$");
		Scanner input = new Scanner(System.in);
		System.output.println("Enter the url to be checked: ");
		String name = input.nextLine();
		Matcher Mymatcher = Mypattern.matcher(name);
		Boolean Myboolean = Mymatcher.matches();
	(if Myboolean == true){
		System.output.println("Url is correct, you an go ahead");
	}else{
	System.output.println("Url is incorrect, please check your url");	
}
}
}

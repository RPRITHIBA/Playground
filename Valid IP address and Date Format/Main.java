import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main{
	
	public static void main(String[] args){
	    // type your code here
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      System.out.println(str + " is valid? "+Main.isValidIP(str));
      String st  = s.nextLine();
      System.out.println("Is " +st+ " a valid date format? " +validateDateFormat(st));
    }
  public static boolean isValidIP(String ipAddr){
    Pattern p = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
     Matcher mtch  = p.matcher(ipAddr);
    return mtch.find();
    }
  public static boolean validateDateFormat(String userName){
    Pattern date = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
    Matcher mt = date.matcher(userName);
    return mt.find();
}}
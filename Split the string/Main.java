import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          // type your code here
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      Pattern p= Pattern.compile("(,| |and|or)");
      String[] parts = p.split(str);
      for(String pa:parts){
        System.out.println(pa);
      }
    }
}
import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      Scanner s = new Scanner(System.in);
      String patternString = s.nextLine();
      String text = s.nextLine();
      Pattern pattern = Pattern.compile(patternString);
      Matcher matcher = pattern.matcher(text);
      int c = 0;
      while(matcher.find()){
        c++;
        System.out.println("found: " + c +" : "+matcher.start()+" - "+matcher.end());
      }
      if(c==0)
      System.out.println("The given word is not present in the string");
      else
        System.out.println(c);
    
                         
    }
}
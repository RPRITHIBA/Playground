import java.util.*;
public class Main<T> 
{ 
  // type your code here
  private T t;
  public void insert(T t)
  {
  this.t = t;
  }
  public T get()
 { return t;}
  public static void main(String[] args) 
     { 
       // type your code here
       Scanner s = new Scanner(System.in);
       Main<Integer> in = new Main<Integer>();
       int n = s.nextInt();
       in.insert(n);
       Main<String> str = new Main<String>();
       String st = s.next();
       str.insert(st);
       Main<Float> f  = new Main<Float>();
       float fl = s.nextFloat();
       f.insert(fl);
       System.out.println("Integer Value: " + in.get());
       System.out.println("String Value: "+str.get());
       System.out.println("Float value: "+f.get());
       }
 }
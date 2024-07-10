package Function;
import java.util.*;
class Show{
    String name;
    int yearOfOpening;
    public void show(String name,int yearOfOpening){
        System.out.println("Name:"+name);
        System.out.println("YEAR OF PASSING:"+yearOfOpening);
    }
}
public class InheritancE {
    public static void main(String[] args) {
      Show s=new Show();
      Scanner sc=new Scanner(System.in);
      String n=sc.nextLine();
      int b=sc.nextInt();
      s.show(n,b);
    }
}

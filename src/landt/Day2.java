package landt;
import java.util.Scanner;
//class Calculator{
//    public int add(int a,int b){
//        int c=a+b;
//        return c;
//    }
//    public int sub(int a,int b){
//        int c=a-b;
//        return c;
//    }
//    public int mul(int a,int b){
//        int c=a*b;
//        return c;
//    }
//    public int swap(int a,int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//        return a;
//    }
//    public String name(int value) {
//        if (value <= 50) {
//            return "ok";
//        }
//        return "not ok";
//    }
//}
//class Calci{
//    public int add(int a,int b){
//        return a+b;
//    }
//    public int add(int a,int b,int c){
//        return a+b+c;
//    }
//    public String ans(int a,String b){
//        return a+b;
//    }
//}
public class Day2 {
    public static void main(String[] args) {
//        Calculator c=new Calculator();
//        System.out.println(c.mul(5,10));
//        System.out.println(c.name(50));
//          Calci c=new Calci();
//        System.out.println( c.ans(1,"A"));
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        for(int i=a;i<=b;i++){
//            if(spec(i)==i)
//            System.out.println(spec(i));
//        }
//    }
//    static int spec(int a) {
//        int first = a / 10;
//        int sec = a % 10;
//
//        int add = first + sec;
//        int mul = first * sec;
//        if (add + mul == a) {
//            return a;
//        }
//        return 0;
//        int nums[][]=new int[3][4];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//                nums[i][j]=(int)(Math.random()*3);// it gives random values inside 100;;
//            }
//            System.out.println();
//        }
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int n[]:nums){
//            for(int m:n){
//                System.out.print(m+ " ");
//            }
//            System.out.println();
//        }
    }
}
class varr extends mul{
    public void matrix(int a,int b){
        for(int i=0;i<a;i++){
                System.out.print(i+" ");
        }
    }

}
class mul{
    public void mul(int a,int b){
        System.out.println(a*b);
    }
}

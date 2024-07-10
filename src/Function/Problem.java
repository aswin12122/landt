package Function;
import java.lang.*;
import java.util.*;
public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
 //       fibonici(x);               //FIBONICCI
}

//        int n = sc.nextInt();
//        System.out.println(Prime(n));   //PRIME-NUMBER
// }
        //--------------------------------------------------------------------------------------------------------------
        //                      PRIME NUMBER
//    static boolean Prime(int n) {
//        for (int i = 2; i <=Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//        }
//    }
//--------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------
        // AMSTRONG NUMBER OR NOT
//        int a = sc.nextInt();
//        int d=a ; // HERE WE NEED TO SAVE THE ORGINAL VALUE OF A
//        int b = 0, c = 0;
//        while (a > 0) {
//            c = a % 10;
//            b = b + (c * c * c);
//            a = a / 10;
//        }
//        if (b ==d) {
//            System.out.println("It is a amstrong number");
//        } else {
//            System.out.println("It is not a amstrong");
//        }

//--------------------------------------------------------------------------------------------------------------

//   TOTAL AMSTRONG NUMBER
//        for(int i=100;i<1000;i++){
//            if(amst(i)){
//                System.out.print(i+" ");
//            }
//        }
//    }
//    static boolean amst(int n){
//        int b=0,c=n;
//        while(n>0) {
//            int d=n%10;
//            b=b+(d*d*d);
//            n=n/10;
//        }
//        if(b==c){
//            return true;
//        }
//        return false;
// }
//--------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------

                            //FIBONICCI
//        static void fibonici(int c){
//            int a=0;int b=1;
//            System.out.print(a+" ");
//            System.out.print(b+" ");
//            for(int i=2;i<c;i++){
//                int temp=b;
//                b=b+a;
//                a=temp;
//                System.out.print(b+" ");
//            }
//        }
//--------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------


//                    COUNT N IN BIG NUMBER
//Scanner sc=new Scanner(System.in);
//    long ass=sc.nextLong();//5005555555555555005
//    int n=sc.nextInt();//5
//    int count=0,last=0;
//        while(ass>0) {
//        last =(int)(ass % 10);
//        if (last == n) {
//            count++;
//        }
//        ass = ass / 10;
//    }
//        System.out.println(count);

//-----------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------
}

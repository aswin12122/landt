package Function;

public class fun2 {
    public static void main(String[] args) {

//        int arr;
//
//        System.out.println(add(1,2,3,4,5);
//    }
//    static int add(int ...v){
//        int i,addi=0;
//        for(i=0;i<v.length;i++){
//            addi+=v[i];
//        }
//        return (addi);


// #######################################################################################################################


// FUNCTION ON ITS CLASS
        aswin a1=new aswin();
        a1.name="ASWIN";
        a1.marks=1000;
        a1.use="useful for nothing";
        aswin a2=new aswin();
        a2.name="ASWIN";
        a2.marks=300;
        a2.use="Nothing to saww";
        aswin a3=new aswin();
        a3.name="ASWIN W/in";
        a3.marks=0;
        a3.use="MORE USEFUL";    //As we are giving it a static in class variable,so all (use)will be converted as it!!.
        aswin Aswin[]=new aswin[3];
        Aswin[0]=a1;
        Aswin[1]=a2;
        Aswin[2]=a3;
        a1.show();
        a2.show();
        a3.show();

//        for(int i=0;i<3;i++){
//            System.out.println(Aswin[i].name+" "+Aswin[i].marks+" "+Aswin[i].use);
//        }
//        for(aswin a:Aswin){
//            System.out.println(a.name+" "+a.marks+" "+a.use);
//        }

     }
}
class aswin{

    String name;
     int marks=100;
     String use;

//----------------------------------------------------------------------------------------------------------------------


//    public void aswin(){
//        name="";
//        use="";
//        System.out.println("Its public");
//    }
//    static{
//        int marks=1000;
//        System.out.println("Its static class");
//    }


//----------------------------------------------------------------------------------------------------------------------
    public void show(){
        System.out.println(name+ " : "+marks+" : "+use);
    }
}


// #######################################################################################################################
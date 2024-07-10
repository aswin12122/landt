package Function;
class ece{
    private String name;
    int age;
    private double cgpa;

    public String getName() {
        return name;
    }
    public double getCgpa(){
        return cgpa;
    }
    public void setName(String name){
        this.name=name;//HERE THIS FIRST(THIS.NAME)SHOWS THE GETING TERM AND REST IS WHICH WILL BE GIVEN IN GETTING
    }
    public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
//    public void print(){
//        System.out.println(name+"-"+age+"-"+cgpa);


}


//----------------------------------------------------------------------------------------------------------------------
//class tele{

//    private String movies="Amigoo";
//    String name="ASWIN";
//    private int time=1200;
//
//     public String getMovies(){
//         return movies;
//     }
//     public void setMovies(String nam){
//         movies= nam;
//     }
//
//     public int getTime(){
//         return time;
//     }
//
//     public void setTime(int a){
//         time= a;
//     }
//     public void show(){
//         System.out.println(movies+" : "+name+" : "+time);
//     }

//}
public class Encap {
    public static void main(String[] args) {
        ece a=new ece();
        a.setName("ASEINN");
        a.setCgpa(3.33);
        System.out.println(a.getName()+" : "+a.getCgpa());
//        ece a1=new ece();
//        ece a2=new ece();
//        a.name="Aswin";
//        a.age=20;
//        a.cgpa=9.1;
//        a1.name="Akil";
//        a1.age=19;
//        a1.cgpa=9.2;
//        a2.name="Ashwanth";
//        a2.age=21;
//        a2.cgpa=9.7;
//
//        a.print();
//        a1.print();
//        a2.print();




//--------------------------------------------------------------------------------------------------------------
//        int x=5;
//        int a=(x++)*2+3;
//        System.out.println(a);
 //       tele t1=new tele();
//        t1.movies="Hollywood";
//        t1.name="Avengers";
//        t1.time=1200;
   //     tele t2=new tele();
//        t2.movies="Kollywood";
//        t2.name="Ae dil muskin";
//        t2.time=0100;
        //   tele a33=new tele();
//        a33.movies="tamilpadam";
//        a33.name="jollywood";
//        a33.time=0200;

//        t1.show();
//        t2.show();
//        a33.show();

//t1.setMovies("Avengers");
//t1.setTime(21212);
   //     System.out.println(t1.getMovies()+":"+t1.getTime()+":"+t1.name);

//----------------------------------------------------------------------------------------------------------------------

    }
}

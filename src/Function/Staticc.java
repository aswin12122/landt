package Function;

public class Staticc {
    public static void main(String[] args) {
        del d1=new del();
        d1.pack=1000;
        d1.area="Alapula";
        d1.time=10;
        del d2=new del();
        d2.pack=2000;
        d2.area="Delhi";
        d2.time=11;
        del d3=new del();
        d3.pack=3000;
        d3.area="Bombay";
        d3.time=12;
        d1.show();
        del.show1(d2);
        d3.show();

    }
}
class del{
    int pack;
    String area;
    static int time;
    public void show(){
        System.out.println(pack+" : "+area+" : "+time);
    }
    public static void show1(del obj){
        System.out.println(obj.pack+" : "+obj.area+" : "+time);
    }

}
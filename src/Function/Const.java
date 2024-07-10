package Function;
class area {
    private String street = "TTTTT";
    double id = 123.90;
    String name = "' ASWWIINN '";

    public area(String street,int id,String name){
        this.street=street;
        this.id=id;
        this.name=name;
    }
}
//    public String getStreet(){
//        return street;
//    }
//    public void setStreet(String street){
//        this.street=street;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//}
public class Const {
    public static void main(String[] args) {
        area a=new area("ase21",123,"SHWETH");
        System.out.println(a);
        //a.street="Theeran chinamalai nagar";
        //a.id=12.4;
        //a.name="Aswin";
        //a.setName("SHWE");
        //a.setStreet("Theeran nagar");
        //System.out.println(a.getStreet()+" : "+a.getName());
    }
}

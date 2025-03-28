public class College {
    String name;
    double percentage;
    College(String name,double percemtage){
        this.name=name;
        this.percentage=percentage;
    }
}
class UGstudent extends College{
    super(name,percentage);
    void eligibility(){
        if (percentage>60){
            System.out.println(name+ "is eligible for UG admission");
        }else{
            System.out.println(name+ "is not eligible for UG admission");
        }
}
}
class PGstudent extends College{
    super(name,percentage);
    void eligibility(){
        if (percentage>70){
            System.out.println(name+ "is eligible for PG admission");
        }else{
            System.out.println(name+ "is not eligible for PG admission");
        }
}
}
public class Admission{
    public static void main(String[] args){
        UGstudent UG1 = new UGstudent("Nandini",90);
        PGstudent PG1 = new PGstudent("Vimala",80);
    }
}

class calculator{
    public int add(int a,int b){
        return a+b;
    public double add(double a, double b){
        return a+b;
    public int add(int a,int b,int c){
        return a+b+c;
    }
    }
    }
}
public class overload {
    public static void main(String[] args){
        calculator c = new calculator();
        System.out.println("sum of 5 and 7 = "+c.add(5,7));
        System.out.println("sum of 10.72 and 190.89 = "+c.add(10.72,190.89));
        System.out.println("sum of 57, 37,35 = "+c.add(57,37,35));
        

    }
    
}

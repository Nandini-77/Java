abstract class Animal {
    public abstract void sound();
}
class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Roaring....");
    }
}
class Tiger extends Animal {
    @Override
    public void sound(){
        System.out.println("Growling....");
    }
}
public class Sounds {
    public static void main(String[] args) {
        System.out.println("K.Nandini, AV.SC.U4CSE24205, CSE-C");
        Lion lion = new Lion();
        lion.sound();
        Tiger tiger = new Tiger();
        tiger.sound();
    }
}

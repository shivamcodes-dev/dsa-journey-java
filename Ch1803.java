public class Ch1803 {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
    }
}

class Animal { 
    void eat(){
        System.out.println("Eating");
    }

    void beath(){
        System.out.println("breathing");
    }
}

class Fish extends Animal{
    void wings(){
        System.out.println("2");
    }

}
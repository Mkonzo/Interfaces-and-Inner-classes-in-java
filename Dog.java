public class Dog implements Mammal {
    public void hunt() {
        System.out.println("The dog is hunting");
    }
    public void breathe(){
        System.out.println("The dog is breathing");
    }
    public void makeSound(){
        System.out.println("The dog is barking");
    }
    public void move(){
        System.out.println("The dog is moving");
    }
    public static void main (String []args){
        //creating an object
        Dog myDog = new Dog();
        
        //calling the methods
        myDog.hunt();
        myDog.breathe();
        myDog.makeSound();
        myDog.move();


    }
}

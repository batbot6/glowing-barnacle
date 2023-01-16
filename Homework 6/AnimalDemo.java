package Homework6;

public class AnimalDemo {

    public static void main(String[] args) {
        Dog Doggo = new Dog();
        Cat Kitty = new Cat();
        Doggo.play();
        Doggo.makesomenoise();
        Doggo.bringstick();
        Kitty.play();
        Kitty.makesomenoise();
        Kitty.climp();
        Bird Tweety = new Bird();
        Bird Vrabi = new Bird();
        Vrabi.sync();
        Vrabi.sync(Tweety,Vrabi); //taka li trqbva da e, stranno izglejda?

    }
}

public class AnimalTest
{
    public static void main(String[] args)
    {
        Animal dog = new Dog("Poodle", 4, 'M');
        dog.eat();
        dog.sleep();
        dog.makeSound();
        System.out.println("");

        // dog is not able to use wagTail
        Dog dog2 = (Dog) dog;
        dog2.wagTail();
        System.out.println("");

        Animal cat = new Cat("Tom", 2, 'F');
        cat.eat();
        cat.sleep();
        cat.makeSound();
        System.out.println("");

        Vet vet = new Vet("Alice");
        vet.Vaccinate(dog);
        System.out.println("");
        vet.Vaccinate(cat);
        System.out.println("");
    }
}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clients.Animal;
import clients.Cat;
import clients.Dog;
import clients.Goable;
import clients.Illness;
import clients.Owner;
import clients.Ytka;



public class App {
    public static void main(String[] args) throws Exception {
        Animal cat = new Cat("miay", new Owner("Artem"), LocalDate.of(2000, 10, 13), new Illness("kashel"), 10D);
        // System.out.println(cat.getOwner());
        // System.out.println(cat.getNickname());
        // System.out.println(cat.getIllness());
        // cat.setIllness(null);
        // Animal testAnimal = new Animal();
        // cat.lifeCycle();
        // System.out.println( cat.getType());
        // System.out.println(cat);
        // cat.lifeCycle();
        // Cat catty = new Cat();
        // Dog doggy = new Dog();
        // System.out.println(doggy.getType());
        // System.out.println(catty.getType());
        // System.out.println(catty);
        // List<Animal> animals = new ArrayList<Animal>();
        // animals.add(catty);
        // animals.add(doggy);
        // int i = 0;
        // for (Animal animal : animals) {
        //     System.out.println(i + " " + animal.getNickname());
        //     i++;
        // }
        // Ytka ytka = new Ytka();
        // ytka.toGo();
        // catty.fly();
        
        List<Goable> list = new ArrayList<>();
        Cat cat2 = new Cat();
        Dog dog2 = new Dog();
        list.add(cat2);
        list.add(dog2);
        System.out.println(list);

        Animal animal = new Animal() {

            @Override
            public void hunt() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'hunt'");
            }
            
        };

    }
}

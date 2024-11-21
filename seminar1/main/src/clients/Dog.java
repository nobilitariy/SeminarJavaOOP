package clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness){
        super(nickname, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }

    @Override
    public void fly() {
        System.out.println("ia ne ymeiy letat");
    }

    @Override
    public void hunt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hunt'");
    }

    @Override
    public void go() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'go'");
    }
    
}

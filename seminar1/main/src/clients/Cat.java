package clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {
    Double discount;

    public Cat(String nickname, Owner owner, LocalDate birthDate, Illness illness, Double disccount){
        super(nickname, owner, birthDate, illness);
        this.discount = disccount;
    }
    
    public Cat(){
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    @Override
    public String toString() {
        return super.toString()+String.format(" Discount %s", discount);
    }

    @Override
    public void fly() {
        System.out.println("Ia ne ymey plavat");
    }

    @Override
    public void swim() {
        System.out.println("Ia ploho plavaiy");
    }

    @Override
    public void hunt() {
        System.out.println("kyshaiy"); 
    }

    @Override
    public void go() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'go'");
    }
    
}

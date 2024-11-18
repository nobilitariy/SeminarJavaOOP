package clients;

import java.time.LocalDate;

public class Cat extends Animal {
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
}

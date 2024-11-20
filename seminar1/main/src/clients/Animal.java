package clients;
import java.time.LocalDate;

public class Animal {
    protected String nickname;
    protected Owner owner; 
    protected LocalDate birthDate;
    protected Illness illness;
    
    
    public Animal() {
        this("klichka", new Owner("hoziain"), LocalDate.now(), new Illness("boleet"));
    }

    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }


    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    private void wakeUp(){
        wakeUp("12");
    }

    private void wakeUp(String time){
        System.out.printf("Животное %s проснулось в %s ", nickname, time);
    }

    private void hunt(){
        System.out.println("Животное ест");
    }

    private void sleep(){
        System.out.println("Животное спит");
    }
    
    public void lifeCycle(){
        wakeUp("12");
        hunt();
        sleep();
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("nickname = %s, bd = %s, owner = %s, illness = %s", nickname, birthDate, owner, illness);
    }

    public void toGo(){
        System.out.println("Ia poshel");
    } 

    public void fly(){
        System.out.println("Ia poletel");
    }

    public void swim(){
        System.out.println("Ia poplil");
    }

}

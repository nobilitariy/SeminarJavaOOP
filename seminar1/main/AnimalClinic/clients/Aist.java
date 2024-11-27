package clients;

public class Aist extends Animal {
    public Aist(){
        super();
    }
    @Override
    public void swim() {
        System.out.println("Ia ne ymeiy platat");
    }
    @Override
    public void hunt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hunt'");
    }
}

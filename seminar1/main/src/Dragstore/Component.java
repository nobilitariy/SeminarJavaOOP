package Dragstore;

public abstract class Component implements Comparable<Component>{
    private String title;
    private Double weight;
    private Integer power;

    public Component(String title, Double weight, Integer power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }
    
    @Override
    public String toString() {
        return String.format("title = %s, power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return Integer.compare(this.power, o.power);
    }
}

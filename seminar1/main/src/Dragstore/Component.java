package Dragstore;

public abstract class Component {
    private String title;
    private Double weight;
    private Integer power;

    public Component(String title, Double weight, Integer power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }
    
}

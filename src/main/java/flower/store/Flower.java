package flower.store;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Flower {

    private double sepalLength;
    private double price;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower other) {
        this.sepalLength = other.sepalLength;
        this.price = other.price;
        this.color = other.color;
        this.flowerType = other.flowerType;
    }
}

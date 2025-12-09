package ucu.edu.ua.flowershop.controller;

import flower.store.Flower;
import flower.store.FlowerColor;
import flower.store.FlowerType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        Flower rose = new Flower();
        rose.setSepalLength(5.0);
        rose.setColor(FlowerColor.RED);
        rose.setPrice(20.0);
        rose.setFlowerType(FlowerType.ROSE);

        Flower tulip = new Flower();
        tulip.setSepalLength(4.0);
        tulip.setColor(FlowerColor.YELLOW);
        tulip.setPrice(15.0);
        tulip.setFlowerType(FlowerType.TULIP);

        return List.of(rose, tulip);
    }
}

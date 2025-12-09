package flower.store;

import lombok.Getter;

@Getter
public enum FlowerColor {

    RED("#FF0000"),
    YELLOW("#FFFF00"),
    WHITE("#FFFFFF");

    private final String code;

    private FlowerColor(String code) {
        this.code = code;
    }
}

package at.tasks.enums;

public class Soys {
    private String name;
    private Sharpness sharpness;

    public Soys(String name, Sharpness sharpness) {
        this.name = name;
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        if (sharpness==sharpness.ОЧЕНЬ_ОСТРЫЙ) {
            return "Соус "+name+" : Очень острый";
        }
        if (sharpness==sharpness.ОСТРЫЙ) {
            return "Соус "+name+" : Острый";
        }
        if (sharpness==sharpness.НЕ_ОСТРЫЙ) {
            return "Соус "+name+" : Не острый";
        }
        return "";
    }
}
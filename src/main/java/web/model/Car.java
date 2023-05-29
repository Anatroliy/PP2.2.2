package web.model;

public class Car {
    String CarBrand;

    String model;
    String Color;

    public Car(String carBrand, String model, String color) {
        this.CarBrand = carBrand;
        this.model = model;
        this.Color = color;
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

}

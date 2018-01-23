package oop_lab7;

public class SuperCar {
    private String carBrand;
    private String carColor;

    public SuperCar (){}
    public SuperCar (String b,String c){
        this.carBrand = b;
        this.carColor = c;
    }

    public String getSuperCarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}

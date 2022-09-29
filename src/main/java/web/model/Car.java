package web.model;

public class Car {

    private int carNumber;
    private String carColor;
    private String carModel;


    public Car(int carNumber, String carColor, String carModel) {
        this.carColor = carColor;
        this.carModel = carModel;
        this.carNumber = carNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber=" + carNumber +
                ", carColor='" + carColor + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}

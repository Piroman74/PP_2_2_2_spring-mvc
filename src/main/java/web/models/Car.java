package web.models;

public class Car {
    private int id;
    private String model;
    private String engine;

    public Car() {
    }

    public Car(int id, String model, String year) {
        this.id = id;
        this.model = model;
        this.engine = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year='" + engine + '\'' +
                '}';
    }
}
package web.model;

import javax.persistence.*;


@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;
    @Column(name = "carOwner")
    private String carOwner;

    public Car(String model, int series, String carOwner) {
        this.model = model;
        this.series = series;
        this.carOwner = carOwner;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }
}

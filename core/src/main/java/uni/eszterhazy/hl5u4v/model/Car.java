package uni.eszterhazy.hl5u4v.model;

import java.time.LocalDate;

public class Car {
    private String licensePlate;
    private String model;
    private int pricePerDay;
    private BodyStyle style;
    private LocalDate availableAt;

    public Car() {

    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate; //TODO: Validation
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public BodyStyle getStyle() {
        return style;
    }

    public void setStyle(BodyStyle style) {
        this.style = style;
    }

    public LocalDate getCreatedAt() {
        return availableAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.availableAt = createdAt; //TODO: REMOVE
    }
}

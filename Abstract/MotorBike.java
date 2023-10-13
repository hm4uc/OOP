public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * constructor1.
     */
    public MotorBike(String brand, String model, String registrationNumber, Person owner,
                     boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    /**
     * get Information.
     */
    public String getInfo() {
        return "Motor Bike:" + '\n'
                + '\t' + "Brand: " + getBrand() + '\n'
                + '\t' + "Model: " + getModel() + '\n'
                + '\t' + "Registration Number: " + getRegistrationNumber() + '\n'
                + '\t' + "Has Side Car: " + isHasSidecar() + '\n'
                + '\t' + "Belongs to " + getOwner().getName() + " - " + getOwner().getAddress();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}

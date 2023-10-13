public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * constructor1.
     */
    public Car(String brand, String model, String registrationNumber, Person owner,
               int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * get Information.
     */
    @Override
    public String getInfo() {
        return "Car:" + '\n'
                + '\t' + "Brand: " + getBrand() + '\n'
                + '\t' + "Model: " + getModel() + '\n'
                + '\t' + "Registration Number: " + getRegistrationNumber() + '\n'
                + '\t' + "Number of Doors: " + getNumberOfDoors() + '\n'
                + '\t' + "Belongs to " + getOwner().getName() + " - " + getOwner().getAddress();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

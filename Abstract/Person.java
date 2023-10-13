import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * constructor1.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * add vehicle.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove vehicle.
     */
    public void removeVehicle(String registrationNumber) {
        Vehicle vehicleRemove = null;
        for (Vehicle v : vehicleList) {
            if (v.getRegistrationNumber().equals(registrationNumber)) {
                vehicleRemove = v;
                break;
            }
        }
        if (vehicleRemove != null) {
            vehicleList.remove(vehicleRemove);
        }
    }

    /**
     * get Information.
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return getName() + " has no vehicle!";
        } else {
            String res = getName() + " has:" + '\n';
            for (Vehicle v : vehicleList) {
                res += '\n' + v.getInfo();
            }
            return res;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

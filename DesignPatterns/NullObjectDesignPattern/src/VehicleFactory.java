public class VehicleFactory {

    static Vehicle getVehicleObject(String typeOfVechicle){
        if ("Car".equalsIgnoreCase(typeOfVechicle)){
            return new Car();
        }

        return new NullVehicle();
    }
}

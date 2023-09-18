package WithStrategy;

import WithStrategy.Strategy.NormalDriveStratagey;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalDriveStratagey());
    }
}

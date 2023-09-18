package WithStrategy;

import WithStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}

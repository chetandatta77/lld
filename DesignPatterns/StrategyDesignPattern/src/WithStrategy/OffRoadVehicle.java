package WithStrategy;

import WithStrategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}

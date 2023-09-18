package WithStrategy;

import WithStrategy.Strategy.DriveStrategy;
import WithStrategy.Strategy.NormalDriveStratagey;

public class GoodsVehicle extends Vehicle {


    public GoodsVehicle() {
        super(new NormalDriveStratagey());
    }
}

package WithStrategy.Strategy;

public class NormalDriveStratagey implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}

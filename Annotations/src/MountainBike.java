public class MountainBike extends Bicycle{
    public int wheelSize;

    public MountainBike(int wheelSize, int gear, int speed){
        super(speed, gear);
        this.wheelSize = wheelSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    /* Annotation for compiler that overrides a
     setter method from bicycle class */
    @Override
    public void setGear(int newGear){
        this.gear = newGear+2;
    }
}

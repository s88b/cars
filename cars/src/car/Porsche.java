package car;

public class Porsche extends Car {
    public Porsche(String name, int price, int velocity) {
        super(name, price, velocity);
    }

    public int GetVelocity() {
        return this.Velocity;
    }
}

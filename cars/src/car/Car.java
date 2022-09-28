package car;

public class Car {
    public static String MadeOf = "metal";
    protected static String Something = "Ahoy!";
    public String Name;
    private int Price;
    protected int Velocity;

    public Car(String name, int price, int velocity) {
        this.Name = name;
        this.Price = price;
        this.Velocity = velocity;
    }

    public int GetPrice() {
        return this.Price;
    }

    public void SetPrice(int price) {
        this.Price = price;
    }
}

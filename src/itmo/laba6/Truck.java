package itmo.laba6;

public class Truck extends Car
{
    private int quantityOfWheels;
    private int maxWeight;

    public void newWheels(int quantityOfWheelsNew)
    {
        this.quantityOfWheels = quantityOfWheelsNew;
        System.out.println("Новое количество колёс: " + this.quantityOfWheels);
        System.out.println("");
    }

    public Truck (int w, String m, char c, float s, int q, int maxW)
    {
        this.weight = w;
        this.model = m;
        this.color = c;
        this.speed = s;

        this.quantityOfWheels = q;
        this.maxWeight = maxW;
    }

    @Override
    public void outPut ()
    {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет грузовика - " + color + " и его скорость - " + speed);
        System.out.println("Количество колёс: " + this.quantityOfWheels);
        System.out.println("Максимальный вес: " + this.maxWeight);
        System.out.println("");
    }
}

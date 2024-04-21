package itmo.laba6;

import java.util.Calendar;

public class Laba6
{
    public static void main(String[] args)
    {
        Client client1 = new Client("Иванов", "Иван", "Иванович", "мужской", "24-01-1985", "Сбербанк", 12345678L);
        Client client2 = new Client("Александрова", "Александра", "Александровна", "женский", "09-05-2005", "ВТБ", 87654321L);

        System.out.println(client1.getFirstName() + " " + client1.getLastName());
        client1.showInfo();

        System.out.println(client2.getFirstName() + " " + client2.getLastName());
        client2.showInfo();

        client1.changeBank("Альфа банк", 43218765L);
        client1.showInfo();

        BankWorker worker1 = new BankWorker("Петров", "Пётр", "Петрович", "мужской", "01-01-1989", "Сбербанк", "программист", "01-09-2023");
        System.out.println(worker1.getFirstName() + " " + worker1.getLastName());
        worker1.showInfo();



        Truck truck1 = new Truck(10000, "Камаз", 'б', 80, 6, 20000);
        truck1.outPut();

        truck1.newWheels(8);

        truck1.outPut();



        Child child = new Child(20);
        System.out.println(child.getValue());
        System.out.println("");



        UserParent userParent = new UserParent();
        userParent.showData();

        UserChild userChild = new UserChild();
        userChild.showData();
        userChild.showAge();
    }
}

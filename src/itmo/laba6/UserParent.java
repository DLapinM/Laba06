package itmo.laba6;

import java.util.Scanner;

public class UserParent
{
    protected int age;

    protected Scanner scanner = new Scanner(System.in);

    public UserParent()
    {
        System.out.print("Введите возраст пользователя: ");
        this.age = scanner.nextInt();

    }

    public void showData()
    {
        System.out.println(this.age);
        System.out.println("");
    }

    public void showAge()
    {
        System.out.println(this.age);
        System.out.println("");
    }
}

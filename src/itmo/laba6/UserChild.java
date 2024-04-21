package itmo.laba6;

public class UserChild extends UserParent
{
    private String name;

    public UserChild()
    {
        System.out.print("Введите имя пользователя: ");
        this.name = scanner.next();
        System.out.println("");
    }

    @Override
    public void showData()
    {
        System.out.println(this.name);
        System.out.println("");
    }
}

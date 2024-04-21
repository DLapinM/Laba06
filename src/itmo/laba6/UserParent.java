package itmo.laba6;

public class UserParent
{
    protected int age;
    public int getAge()
    {
        return age;
    }

    UserParent(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return "UserParent";
    }
}

package itmo.laba6;

public class UserChild extends UserParent
{
    private String name;

    public UserChild(int age, String name)
    {
        super(age);
        this.name = name;
    }

    @Override
    public String getName()
    {
        return "UserChild" + " " + this.name;
    }
}

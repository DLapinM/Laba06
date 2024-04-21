package itmo.laba6;

import java.time.*;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Client extends Human implements IClientable
{
    private String bankName;

    private long moneyAccountId;

    Client(String lastName, String firstName, String fathername, String gender, String dateOfBirthString, String bankName, long moneyAccountId)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fathername;

        if (gender.equals("женский")) this.gender = gender;
        else this.gender = "мужской";


        String[] dateOfBirthStringArray = dateOfBirthString.split("-");
        if (dateOfBirthStringArray.length == 3)
        {
            this.dateOfBirth = LocalDate.of(Integer.parseInt(dateOfBirthStringArray[2]), Integer.parseInt(dateOfBirthStringArray[1]), Integer.parseInt(dateOfBirthStringArray[0]));
        }
        else this.dateOfBirth = LocalDate.now();

        this.bankName = bankName;

        this.moneyAccountId = moneyAccountId;
    }

    public void showInfo()
    {
        System.out.println("Фамилия: " + this.lastName);
        System.out.println("Имя: " + this.firstName);
        System.out.println("Отчество: " + this.fatherName);
        System.out.println("Пол: " + this.gender);
        System.out.println("Возраст: " + getAge());
        System.out.println("Дата рождения: " + getDateOfBirthString());
        System.out.println("Имя банка: " + this.bankName);
        System.out.println("Номер банковского счёта: " + this.moneyAccountId);
        System.out.println("");
    }

    public String getBankName()
    {
        return this.bankName;
    }

    public long getMoneyAccountId()
    {
        return this.moneyAccountId;
    }

    public void changeBank(String newBankName, long newMoneyAccountId)
    {
        this.bankName = newBankName;
        this.moneyAccountId = newMoneyAccountId;
    }
}

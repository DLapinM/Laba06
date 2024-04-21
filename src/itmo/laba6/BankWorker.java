package itmo.laba6;

import java.time.*;

import java.time.format.DateTimeFormatter;

public class BankWorker extends Human implements IBankWorkerable
{
    private String bankName;
    private String jobTitle;
    private LocalDate dateOfStartWorking;

    BankWorker(String lastName, String firstName, String fathername, String gender, String dateOfBirthString, String bankName, String jobTitle, String dateOfStartWorkingString)
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

        this.jobTitle = jobTitle;

        String[] dateOfStartWorkingStringArray = dateOfStartWorkingString.split("-");
        if (dateOfStartWorkingStringArray.length == 3)
        {
            this.dateOfStartWorking = LocalDate.of(Integer.parseInt(dateOfStartWorkingStringArray[2]), Integer.parseInt(dateOfStartWorkingStringArray[1]), Integer.parseInt(dateOfStartWorkingStringArray[0]));
        }
        else this.dateOfStartWorking = LocalDate.now();
    }

    public String getBankName()
    {
        return this.bankName;
    }

    public String getJobTitle()
    {
        return this.jobTitle;
    }

    public String getDateOfStartWorkingString()
    {
        return dateOfStartWorking.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
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
        System.out.println("Должность: " + this.jobTitle);
        System.out.println("Дата устройства на работу: " + getDateOfStartWorkingString());
        System.out.println("");
    }
}

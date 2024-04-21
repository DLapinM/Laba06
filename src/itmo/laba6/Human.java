package itmo.laba6;

import java.time.*;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Human implements IHumanable
{
    protected String lastName;
    protected String firstName;
    protected String fatherName;

    protected String gender;

    protected LocalDate dateOfBirth;

    public int getAge()
    {
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        LocalDate today = LocalDate.now( zoneId );
        Period p = Period.between(this.dateOfBirth, today);
        return p.getYears();
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getFatherName()
    {
        return this.fatherName;
    }

    public String getDateOfBirthString()
    {
        return dateOfBirth.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String getGender()
    {
        return this.gender;
    }

    public abstract void showInfo();
}

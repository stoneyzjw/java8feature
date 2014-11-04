package tax.fjgs.longyan.java8feature.chapter05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static tax.fjgs.longyan.java8feature.chapter05.Gender.MALE;
import static tax.fjgs.longyan.java8feature.chapter05.Gender.FEMALE;

public class Person
{
	private String firstName;

	private String lastName;

	private LocalDate dob;

	private Gender gender;

	public Person(String firstName, String lastName, LocalDate dob, Gender gender)
	{
		this.firstName	= firstName;
		this.lastName	= lastName;
		this.dob		= dob;
		this.gender		= gender;
	}

	@Override
	public String toString()
	{
		return firstName + " " + lastName + ", " + gender + ", " + dob;
	}

	public static List<Person> getPersons()
	{
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("John", "Jacobs", LocalDate.of(1975, 1, 20), MALE));
		list.add(new Person("Wally", "Inman", LocalDate.of(1975, 9, 12), MALE));
		list.add(new Person("Donna", "Jacobs", LocalDate.of(1970, 9, 12), FEMALE));
		return list;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public LocalDate getDob()
	{
		return dob;
	}

	public void setDob(LocalDate dob)
	{
		this.dob = dob;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
}


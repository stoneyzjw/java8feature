package tax.fjgs.longyan.java8feature.chapter05;

import java.util.Comparator;
import java.util.List;

public class ComparingObjects
{
	public static void main(String[] args)
	{
		List<Person> persons = Person.getPersons();

		persons.sort(Comparator.comparing(Person::getFirstName));
		System.out.println("按姓氏排序后的结果：");
		FunctionUtil.forEach(persons, System.out::println);

		persons.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName).thenComparing(Person::getDob));
		System.out.println("\n按姓名、出生日期排序后的结果：");
		FunctionUtil.forEach(persons, System.out::println);
	}
}

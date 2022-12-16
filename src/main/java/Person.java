public class Person {

    private String name;
    private String lastName;
    private int age;
    private String city;

    public Person(String newName, String newLastName, int newAge, String newCity) {
        this.name = newName;
        this.lastName = newLastName;
        this.age = newAge;
        this.city = newCity;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Boolean hasAge() {
        return getAge() <= 0;
    }

    public Boolean hasCity() {
        return getCity() == null;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        age++;
    }

    public PersonBuilderImpl newChildrenBuilder() {
        String childLastName = getLastName();
        int childAge = getAge() - 20;
        String childCity = getCity();

        PersonBuilderImpl childPerson = new PersonBuilderImpl();
        childPerson.setNewLastName(childLastName);
        childPerson.setNewAge(childAge);
        childPerson.setNewCity(childCity);

        return childPerson;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Фамилия: " + lastName + " Возраст: " + age + " Город " + city;
    }
}

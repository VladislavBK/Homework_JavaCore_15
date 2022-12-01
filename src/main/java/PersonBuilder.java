public interface PersonBuilder {
    PersonBuilderImpl setName(String name);
    PersonBuilderImpl setLastName(String lastName);
    PersonBuilderImpl setAge(int age);
    PersonBuilderImpl setCity(String city);
    Person build();

}

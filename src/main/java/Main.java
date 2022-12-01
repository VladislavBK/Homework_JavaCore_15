public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilderImpl()
                .setName("Анна")
                .setLastName("Вольф")
                .setAge(31)
                .setCity("Сидней")
                .build();
        Person son = mom.newChildrenBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
    }
}

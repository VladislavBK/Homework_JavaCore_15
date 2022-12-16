public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilderImpl()
                .setNewName("Анна")
                .setNewLastName("Вольф")
                .setNewAge(31)
                .setNewCity("Сидней")
                .build();
        Person son = mom.newChildrenBuilder()
                .setNewName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            boolean check = mom.getName() == null ||
                    mom.getLastName() == null ||
                    mom.getAge() == 0 ||
                    mom.hasCity();
            if (check) {
                throw new IllegalStateException("Заполните обязательные поля");
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            boolean check = mom.hasAge();
            if (check) {
                throw new IllegalArgumentException("Введите корректный возраст");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

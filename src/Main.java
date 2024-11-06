public class Main {
    public static void main(String[] args) {
        // Task-1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        // Task-2
        String upperCasedFullName = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCasedFullName);
    }
}
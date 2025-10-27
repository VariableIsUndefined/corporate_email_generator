import java.util.Scanner;

public class Main {
    public static Department parseDepartment(String input) {
        return switch (input.trim().toLowerCase()) {
            case "it" -> Department.IT;
            case "fin", "finance" -> Department.FINANCE;
            case "hr" -> Department.HR;
            default -> Department.GENERAL;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите отдел: ");
        Department department = parseDepartment(scanner.nextLine());

        System.out.print("Введите компанию: ");
        String company = scanner.nextLine();

        System.out.println("--------------------");

        Employee employee = new Employee(
                name,
                surname,
                department,
                company
        );
        System.out.println(employee.getEmail());
        System.out.println(employee.getPassword());
        System.out.println(employee.getDepartment());
    }
}
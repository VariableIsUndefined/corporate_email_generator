public class Employee {
    private String name;
    private String surname;
    private Department department;
    private String company;
    private String email;
    private String password;

    public Employee(String name, String surname, Department department, String company) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.company = company;
        this.email = "%s.%s@%s.%s.com".formatted(name.toLowerCase(), surname.toLowerCase(), department.getName(), company);
        this.password = EmployeeUtils.generatePassword(15);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Department getDepartment() {
        return department;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

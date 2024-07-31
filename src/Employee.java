import java.util.Objects;
public class Employee {
    private String fullname;
    private int department;
    private int salary;
    private static int count = 1;
    private int id;

    public Employee(String fullname, int department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }
    public static int id(int i) {
        i++;
        return i;
    }

    public String getFullname() {
        return fullname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ". ФИО: " + fullname + ", Отдел: " + department + ", Зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee newEmployee = (Employee) o;
        return department == newEmployee.department && salary == newEmployee.salary && id == newEmployee.id && Objects.equals(fullname, newEmployee.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, department, salary, id);
    }
}

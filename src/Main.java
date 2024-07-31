public class Main {
    public static Employee createEmployee(String fullname, int department, int salary) {
        Employee employee = new Employee(fullname, department, salary);
        return employee;
    }


    public static int calculareSalary(Employee[] employees) {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employeeNew = employees[i];
            if (employeeNew != null) {
                result = result + employeeNew.getSalary();
            }
        }
        return result;
    }

    public static int maxSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            int employeeMax = employees[i].getSalary();
            if (employeeMax > max) {
                max = employeeMax;
            }
        }
        return max;
    }

    public static int minSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            int employeeMax = employees[i].getSalary();
            if (employeeMax < min) {
                min = employeeMax;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = createEmployee("Ivanov I.I.", 5, 80000);
        employees[1] = createEmployee("Petrov P.P.", 4, 70000);
        employees[2] = createEmployee("Sidorov S.S.", 3, 65000);
        employees[3] = createEmployee("Valentinova V.V.", 2, 73000);
        employees[4] = createEmployee("Adamova A.A.", 1, 68500);
        employees[5] = createEmployee("Fedorov F.F.", 1, 69000);
        employees[6] = createEmployee("Kimov K.K.", 2, 71500);
        employees[7] = createEmployee("Pavlova P.P.", 3, 67200);
        employees[8] = createEmployee("Andreev A.A.", 4, 72300);
        employees[9] = createEmployee("Afanasiev A.A.", 5, 66000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());


        }
        System.out.println();
        int result = calculareSalary(employees);

        System.out.println("Сумма затрат на ЗП в месяц равна: " + result);
        System.out.println();
        System.out.println("Среднее значение зарплат равно: " + result / employees.length);



        System.out.println();
        int min = minSalary(employees);
        System.out.println("Минимальная зарплата у сотрудника:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == min) {
                System.out.println(employees[i].toString());
            }

        }

        System.out.println();
        int max = maxSalary(employees);
        System.out.println("Максимальная зарплата у сотрудника:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == max) {
                System.out.println(employees[i].toString());
            }

        }
        System.out.println();
        System.out.println("Список ФИО сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullname());
        }
    }
}
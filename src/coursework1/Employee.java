package coursework1;

public class Employee {
    private final String fullName;
    private int department;
    int salary;
    public static int count = 0;
    Employee[] employee = new Employee[getSalary()];


    public Employee(String fullName,  int department, int salary) {
        this.fullName= fullName;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return  department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ФИО сотрудника - " + getFullName() + " Отдел - " + getDepartment() + " Зарплата - " + getSalary() + " Номер сотрудника - " + count;
    }


    public int sumSalary(int salary) {
        for (int i = 0; i < employee.length; i++) {
            this.salary = employee1.salary + salary;
            System.out.println(salary);
            return this.salary;


        }
        return salary;
    }
}




    // public static id () {
      //this.id = id;
    //count++;
    //}



package coursework1;

public class Employee {
    public static int count = 0;

    private String fullName;
    private int department;
    private int salary;
    private int id;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
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
    //public String toString() {
      //  return "ФИО сотрудника - " + getFullName() + " Отдел - " + getDepartment() + " Зарплата - " + getSalary() + " Номер сотрудника - " + count;
   // }

}

package coursework1;

public class Employee {
    String fullName;
    int department;
    int salary;
    public static int count = 0;

    public Employee(String fullName,  int department, int salary) {
        this.fullName= fullName;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return  this.department;
    }

    public int getSalary() {
        return this.salary;
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




    // public static id () {
      //this.id = id;
    //count++;
    //}
}


package coursework1;

public class Main {
    Employee[] employee = new Employee[10];

    public void main(String[] args) {
        Employee employee2 = new Employee("Александр Сергеевич Трубачев", 2, 56000);
    }

    public void printAll() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee);
        }
    }


}

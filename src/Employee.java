public class Employee {
    static int idGenerator = 1;
    int id;
    String fullName;
    int department;
    double salary;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idGenerator++;
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
    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString (){
        return "ID: " + this.id + " ФИО " +  this.fullName + " Отдел: " + this.department + " Зарплата: " + this.salary;
    }

}

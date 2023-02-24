public class Main {
    private static Employee [] employees = new Employee [5];
    public static void main(String[] args) {
        employees[0] = new Employee("Игорь Костров", 1, 45_000);
        employees[1] = new Employee("Сергей Петров ", 2, 38_000);
        employees[2] = new Employee("Федор Измайлов ", 1, 50_000);
        listEmployees();
        listSum();
        showEmployeesMinimumSalary();
        showEmployeeMaximumSalary();
        averageSalary();
        listOfEmployees();

    }
 private static void listEmployees(){
  for (Employee employee:employees ) {
      if (employee != null) {
          System.out.println(employee);
      }
  }
 }
 private static void listSum () {
        double sum = 0;
        for (Employee employee:employees) {
           if (employee != null) {
               sum += employee.getSalary();
           }
        }
     System.out.println("Общая сумма " + sum);
 }
 private static void showEmployeesMinimumSalary(){
     double minimum = Double.MAX_VALUE;
     Employee showEmployeesMinimumSalary = null;
     for (Employee employee:employees){
         if (employee != null && employee.getSalary() < minimum) {
             minimum = employee.getSalary();
             showEmployeesMinimumSalary = employee;
         }
     }
     System.out.println("Наименьшая зарплата " + showEmployeesMinimumSalary);
 }
 private static void showEmployeeMaximumSalary(){
     double maximum = Double.MIN_VALUE;
     Employee showEmployeeMaximumSalary = null;
     for (Employee employee:employees) {
         if (employee != null && employee.getSalary() > maximum) {
             maximum = employee.getSalary();
             showEmployeeMaximumSalary = employee;
         }
     }
     System.out.println("Наибольшая зарплата " + showEmployeeMaximumSalary);
 }
 private static void averageSalary(){
        double sum =0;
        int start = 0;
        for (Employee employee:employees){
            if (employee != null) {
                sum += employee.getSalary();
                start++;
            }
        }
     System.out.println("Средняя значение " + sum/start);
 }
  private static void listOfEmployees(){
      for (Employee employee:employees) {
          if (employee != null) {
              System.out.println(employee.getFullName());
          }
      }

    }
}
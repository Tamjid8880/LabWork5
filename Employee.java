public class Employee {
    
    String EmployeeName;
    int EmployeeId;

public Employee(String name,int id){

    EmployeeName=name;
    EmployeeId=id;
}

public static void main(String args[]){

    Employee E1=new Employee("Tamjid",5542);
    System.out.println(E1.EmployeeName+" "+E1.EmployeeId);
}
}

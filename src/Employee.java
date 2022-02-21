/*
Class Employee extends Human
- String employeeId
- String jobname;
- Int salary
Constructor default+param
override void printData()
Getter/setter
 */

public class Employee extends Human {
    private String employeeId;
    private String jobName;
    private int salary;

    public Employee (){}
    public Employee(String name, int age, String employeeId, String jobName, int salary){
        super(name, age);
        this.employeeId = employeeId;
        this.jobName = jobName;
        this.salary = salary;
    }

    public String getEmployeeId(){
        return  employeeId;
    }

    public String getJobName(){
        return jobName;
    }

    public int getSalary(){
        return salary;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public void setJobName(String jobName){
        this.jobName = jobName;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public void printData(){
        System.out.println(getName()+" "+getAge()+" "+employeeId+" "+jobName+" "+salary);
    }
}

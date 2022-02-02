public class officeManagement {
    public static void main(String[] args) {
        Department dep1=new Department("D001","人事部");
        Department dep2=new Department("D002","市场部");
        Duty dut1=new Duty("P001","经理");
        Duty dut2=new Duty("P002","职员");
        Duty dut3=new Duty("P003","助理");
        Employee emp1=new Employee("张铭","S001","男",29,dep1,dut1);
        System.out.println(emp1);
        System.out.println("======================================");
        Employee emp2=new Employee("李艾爱","S002","女",21,dep1,dut3);
        System.out.println(emp2);
        System.out.println("======================================");
        Employee emp3=new Employee("孙超","S004","男",29,dep1,dut2);
        System.out.println(emp3);
        System.out.println("======================================");
        Employee emp4=new Employee("张美美","S005","女",26,dep2,dut2);
        System.out.println(emp4);
        System.out.println("======================================");
        Employee emp5=new Employee("兰迪","S006","男",37,dep2,dut1);
        System.out.println(emp5);
        System.out.println("======================================");
        Employee emp6=new Employee("米莉","S007","女",24,dep2,dut2);
        System.out.println(emp6);
        System.out.println("======================================");
        dep1.addEmployee(emp1);
        dep1.addEmployee(emp2);
        dep1.addEmployee(emp3);
        dep2.addEmployee(emp4);
        dep2.addEmployee(emp5);
        dep2.addEmployee(emp6);
        System.out.println(dep1.getDepName()+"总共有"+dep1.getEmployeeAmount()+"名员工");
        System.out.println(dep2.getDepName()+"总共有"+dep1.getEmployeeAmount()+"名员工");
    }
}

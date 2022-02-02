public class Department {
    private String depID;
    private String depName;
    private Employee[] employeeList;
    private int employeeAmount=0;
    public Department(){

    }
    public Department(String depID, String depName){
        this.setDepID(depID);
        this.setDepName(depName);
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Employee[] getEmployeeList() {
        if(this.employeeList==null){
            this.employeeList = new Employee[100];
        }
        return this.employeeList;
    }

    public void setEmployeeList(Employee employee) {
        this.getEmployeeList()[this.getEmployeeAmount()]= employee;
        this.setEmployeeAmount(this.getEmployeeAmount()+1);
    }

    public int getEmployeeAmount() {
        return employeeAmount;
    }

    public void setEmployeeAmount(int employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    public void addEmployee(Employee employee){
        for(int i =0;i<this.getEmployeeAmount()+1;i++){
            if(this.getEmployeeList()[i]==null){
                setEmployeeList(employee);
                break;
            }

        }
    }

    @Override
    public String toString() {
        return this.getDepName();
    }
}

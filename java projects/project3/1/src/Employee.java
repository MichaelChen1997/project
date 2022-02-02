public class Employee {
    private String name;
    private String employeeID;
    private String gender;
    private int age;
    private Department department;
    private Duty duty;

    public Employee(){

    }

    public Employee(String name, String employeeID, String gender, int age, Department department, Duty duty){
        this.setName(name);
        this.setEmployeeID(employeeID);
        this.setGender(gender);
        this.setAge(age);
        this.setDepartment(department);
        this.setDuty(duty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            return;
        }
        this.age = age;
    }

    public Department getDepartment() {
        if(this.department==null)
            this.department = new Department();
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Duty getDuty() {
        if(this.duty==null)
            this.duty = new Duty();
        return this.duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }


    @Override
    public String toString() {
        return "姓名：" + this.getName() + '\n' +
                "工号：" + this.getEmployeeID() + '\n' +
                "性别：" + this.getGender() + '\n' +
                "年龄：" + this.getAge() + '\n' +
                "职务：" + this.getDepartment() + this.getDuty() + '\n';
    }
}

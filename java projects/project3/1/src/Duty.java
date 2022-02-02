public class Duty {
    private String dutyID;
    private String depName;
    public  Duty(){

    }
    public  Duty(String dutyID, String depName){
        this.dutyID = dutyID;
        this.depName = depName;
    }

    public String getDutyID() {
        return dutyID;
    }

    public void setDutyID(String dutyID) {
        this.dutyID = dutyID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return this.getDepName();
    }
}

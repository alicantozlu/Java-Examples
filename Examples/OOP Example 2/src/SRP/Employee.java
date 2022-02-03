package SRP;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    //Getters
    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public Date getDateOfJoining() {
        return this.dateOfJoining;
    }

    //Setters
    public void setEmployeeId(String emp) {
        this.employeeId = emp;
    }

    public void setName(String na) {
        this.name = na;
    }

    public void setAddress(String add) {
        this.address = add;
    }

    public void setDateOfJoining(Date da) {
        this.dateOfJoining = new Date();
    }

}

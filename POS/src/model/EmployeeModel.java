package model;


public class EmployeeModel {
    int ID;
    String Name;
    String Username;
    String Password;

    public EmployeeModel(String Emp_Name, String Username, String Password) {
        this.Name = Emp_Name;
        this.Username = Username;
        this.Password = Password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmp_Name() {
        return Name;
    }

    public void setEmp_Name(String Emp_Name) {
        this.Name = Emp_Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}




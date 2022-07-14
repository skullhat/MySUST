
public class Employee {
    private int emp_id;
    private String name;
    private String dpart;
    private int slalary;
    private int bounus;
    private boolean resudnt;

    public Employee() {

    }

    public Employee(int id, String n) {
        emp_id = id;
        name = n;
    }

    public Employee(int id, String n, boolean isReindant) {
        emp_id = id;
        name = n;
        resudnt = isReindant;
    }

    public Employee(int id, String n, String db, int s, int b, boolean isReindant) {
        emp_id = id;
        name = n;
        dpart = db;
        slalary = s;
        bounus = b;
        resudnt = isReindant;
    }

    public void setSalary(int s) {
        slalary = s;
    }

    public void setSalary(int s, int b) {
        slalary = s;
        bounus = b;
    }

    public void setDepart(String db) {
        dpart = db;
    }

    public void setId(int id) {
        emp_id = id;
    }

    public void printEmpData() {
        System.out.println("Name: " + name + "\nId: " + emp_id + "\nDepartmnt: " + dpart + "\nSalary: " + slalary
                + "\nBounus: " + bounus + "\nIs Resundant: " + resudnt);
    }
}

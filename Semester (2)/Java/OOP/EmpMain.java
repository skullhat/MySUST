public class EmpMain {
    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.setId(123);
        em1.printEmpData();
        Employee em2 = new Employee(2, "Omer", "IT", 2500, 500, false);
        em2.printEmpData();
    }
}

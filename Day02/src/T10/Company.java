package T10;

public class Company implements Money{

    private double totalSalary;

    public Company() {
    }

    public Company(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public void paySalary(Employee employee) {
        setTotalSalary(getTotalSalary() - employee.getSalary());
        System.out.println("给" + employee.getName() + "发" + employee.getSalary() +"元,公司剩余:" + getTotalSalary() + "元");
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

}

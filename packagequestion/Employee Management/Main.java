import com.company.hr.Employee;
import com.company.payroll.Payroll;

class MainApp {
    public static void main(String[] args){

        Employee e=new Employee();
        e.set(1,"Ravi","IT",50000);

        Payroll p=new Payroll();

        e.display();
        System.out.println("Bonus: "+p.bonus(e));
    }
}
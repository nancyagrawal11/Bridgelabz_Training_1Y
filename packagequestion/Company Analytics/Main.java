import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

class MainApp {
    public static void main(String[] args){

        SalesReport s=new SalesReport();
        EmployeeReport e=new EmployeeReport();

        s.show();
        e.show();
    }
}
package joseph.basic.testprep;

import java.util.Scanner;

public class EmployeeV2Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService1 empsrv = EmployeeService1Impl.getInstance();

        String menu = "";

        while(true){
            empsrv.displaymenu();
            menu = sc.next();

            switch (menu) {
                case "1":
                    empsrv.newEmployee();
                    break;
                case "2":
                    empsrv.showEmployee();
                    break;
                case "3":
                    empsrv.showOneEmployee();
                    break;
                case "4":
                    empsrv.modifyEmployee();
                    break;
                case "5":
                    empsrv.removeEmployee();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
        }
        }
    }
}

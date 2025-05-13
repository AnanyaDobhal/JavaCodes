import java.util.Scanner;

class EmpExp extends RuntimeException {
    public EmpExp(String message) {
        super(message);
    }
}

class Main {
    public static boolean isvalidname(String name) {
        return name != null && !name.isEmpty() && Character.isUpperCase(name.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        try {
            if (!isvalidname(name)) {
                EmpExp e = new EmpExp("Invalid_Name");
                throw e;
            }
        } catch (EmpExp e) {
            System.out.println(e);
        }
        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();
        try {
            if (!(empid >= 2001 && empid <= 5001)) {
                EmpExp e = new EmpExp("Invalid_Id");
                throw e;
            }
        } catch (EmpExp e) {
            System.out.println(e);
        }
        System.out.print("Enter Department ID: ");
        int depId = sc.nextInt();
        try {
            if (!(depId >= 1 && depId <= 5)) {
                EmpExp e = new EmpExp("Invalid_Department_Id");
                throw e;
            }
        } catch (EmpExp e) {
            System.out.println(e);
        }

        System.out.println(name + " " + empid + " " + depId);
    }
}

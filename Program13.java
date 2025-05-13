abstract class Temperature {
    double temp;

    void setTempData(double temp) {
        this.temp = temp;
    }

    abstract void changeTemp();
}

class Fahrenheit extends Temperature {
    double ctemp;

    void changeTemp() {
        ctemp = 5.0 / 9.0 * (temp - 32);
        System.out.println(temp + " Fahrenheit is equal to " + ctemp + " Celsius.");
    }
}

class Celsius extends Temperature {
    double ftemp;

    void changeTemp() {
        ftemp = (9.0 / 5.0) * temp + 32;
        System.out.println(temp + " Celsius is equal to " + ftemp + " Fahrenheit.");
    }
}

public class Program13 {
    public static void main(String args[]) {
        Fahrenheit ft = new Fahrenheit();
        ft.setTempData(100);
        ft.changeTemp();
        Celsius ct = new Celsius();
        ct.setTempData(37.7);
        ct.changeTemp();
    }
}

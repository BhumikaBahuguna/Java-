abstract class Temperature {
    double temp;
    void setTempData(double temp) {
        this.temp = temp;
    }
    abstract void changeTemp();
}
class Fahrenheit extends Temperature {
    double ctemp;
    @Override
    void changeTemp() {
        ctemp = (5.0 / 9.0) * (temp - 32);
        System.out.println(temp + "F = " + ctemp + "C");
    }
}
class Celsius extends Temperature {
    double ftemp;

    @Override
    void changeTemp() {
        ftemp = (9.0 / 5.0) * temp + 32;
        System.out.println(temp + "C = " + ftemp + "F");
    }
}

public class TemperatureConversion {
    public static void main(String[] args) {
        Temperature fahrenheit = new Fahrenheit();
        fahrenheit.setTempData(98.6);
        fahrenheit.changeTemp();

        Temperature celsius = new Celsius();
        celsius.setTempData(37);
        celsius.changeTemp();
    }
}

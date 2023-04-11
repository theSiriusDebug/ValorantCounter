package alishev;

public class VOIDS {
    public static double USDcounter(double amount) {
        return amount <= 475 ? Math.round(9.99 / 1000 * amount) :
               amount <= 1000 ? Math.round(9.99 / 1000 * amount) :
               amount <= 2050 ? Math.round(19.99 / 2050 * amount) :
               amount <= 3650 ? Math.round(34.99 / 3650 * amount) :
               amount <= 5350 ? Math.round(49.99 / 5350 * amount) :
               amount <= 11000 ? Math.round(99.99 / 11000 * amount) : -1;
    }

}

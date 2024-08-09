package entities;

public class CurrencyConverter {

    public static int IOF = 6;

    public static double Calculator(double dollarPrice, double dollarBought){
        return (((dollarPrice * IOF)/100) + dollarPrice) * dollarBought;
    }

}

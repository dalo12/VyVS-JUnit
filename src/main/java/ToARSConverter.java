public class ToARSConverter {
/*
 * This is a simple currency converter based in the gold value of each currency
 * Actual value may vary
 * Gold value based on goldbroker.com
 */
    private static final double SELL_INCREMENT = 0.05;
    private static final double ARS_1KG_GOLD =  22402286.55;
    private static final double CNY_1KG_GOLD =  468333.50;
    private static final double USD_1KG_GOLD =  63992.20 ;

    public double usdToArs(double amount, boolean sell){
        double value = amount * ARS_1KG_GOLD / USD_1KG_GOLD;

        if(sell){
            value += value * SELL_INCREMENT;
        }

        return round(value);
    }

    public double cnyToArs(double amount, boolean sell){
        double value = amount * ARS_1KG_GOLD / CNY_1KG_GOLD;

        if(sell){
            value += value * SELL_INCREMENT;
        }

        return round(value);
    }

    protected double round(double amount){
        double total = Math.round(amount * 100);
        total = total / 100;

        return total;
    }
}

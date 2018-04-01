package com.lam.utilString;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class CurrencyFormatter {
    private DecimalFormat decimalFormat;
    private DecimalFormatSymbols dfs;

    public CurrencyFormatter(Locale locale) {
        decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
        dfs = DecimalFormatSymbols.getInstance(locale);
    }

    public static void main(String args[]) {
        double money = 12324.134;

        CurrencyFormatter currencyFormatter = new CurrencyFormatter(new Locale("zh", "CN"));
        currencyFormatter.setFractionDigits(2);
        currencyFormatter.println(money);

        CurrencyFormatter currencyFormatter2 = new CurrencyFormatter(new Locale("en", "IN"));
        currencyFormatter2.setFractionDigits(2);
        currencyFormatter2.println(money);

        CurrencyFormatter currencyFormatter3 = new CurrencyFormatter(new Locale("en", "US"));
        currencyFormatter3.setFractionDigits(2);
        currencyFormatter3.println(money);

        CurrencyFormatter currencyFormatter4 = new CurrencyFormatter(new Locale("fr", "FR"));
        currencyFormatter4.setFractionDigits(2);
        currencyFormatter4.println(money);
    }

    private void setCurrencySymbol(String currencySymbol) {
        dfs.setCurrencySymbol(currencySymbol);
        decimalFormat.setDecimalFormatSymbols(dfs);
    }

    public void setFractionDigits(int fractionDigits) {
        decimalFormat.setMaximumFractionDigits(fractionDigits);
    }

    public void println(double money) {
        System.out.println(decimalFormat.format(money));
    }

}

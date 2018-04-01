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

    private void setCurrencySymbol(String currencySymbol) {
        dfs.setCurrencySymbol(currencySymbol);
        decimalFormat.setDecimalFormatSymbols(dfs);
    }

    public void setFractionDigits(int fractionDigits) {
        decimalFormat.setMaximumFractionDigits(fractionDigits);
    }

    public String format(double money) {
        return decimalFormat.format(money);
    }

    public static void main(String args[]) {
        double money = 12324.134;

        CurrencyFormatter currencyFormatter = new CurrencyFormatter(new Locale("zh", "CN"));
        currencyFormatter.setFractionDigits(2);
        System.out.println(currencyFormatter.format(money));

        CurrencyFormatter currencyFormatter2 = new CurrencyFormatter(new Locale("en", "IN"));
        currencyFormatter2.setFractionDigits(2);
        System.out.println(currencyFormatter2.format(money));

        CurrencyFormatter currencyFormatter3 = new CurrencyFormatter(new Locale("en", "US"));
        currencyFormatter3.setFractionDigits(2);
        System.out.println(currencyFormatter3.format(money));

        CurrencyFormatter currencyFormatter4 = new CurrencyFormatter(new Locale("fr", "FR"));
        currencyFormatter4.setFractionDigits(2);
        System.out.println(currencyFormatter4.format(money));
    }
}

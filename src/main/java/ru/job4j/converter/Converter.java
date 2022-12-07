package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);

        System.out.println("140" + " rubles are " + euro + " euro.");
        System.out.println("140" + " rubles are " + dollar + " dollar.");

        float in = 140;
        float expectedEuro = 2;
        float expectedDollar = 2.3333333F;
        float outEuro = Converter.rubleToEuro(in);
        float outDollar = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(in + " rubles are " + expectedEuro + ". Test result : " + passedEuro);
        System.out.println(in + " rubles are " + expectedDollar + ". Test result : " + passedDollar);
    }
}
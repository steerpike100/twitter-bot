package tech.verenti.support;

import java.util.Random;

public class PayLoad {

    public PayLoad() {
    }

    private static String[] Possessive = {"my", "her", "his"};

    private static String[] MainClause = {"father", "mother", "brother", "sister"};

    private static String[] AdverbialClause = {"cooked a nice meal of dumplings and custard", "rode to the post office", "rode the winner at the 14:50 at Thirsk",
            "became agitated when their football was stolen "};

    private static Random rand = new Random();

    public static String generateName() {
        return Possessive[rand.nextInt(Possessive.length)] + " " +
                MainClause[rand.nextInt(MainClause.length)] + " " +
                AdverbialClause[rand.nextInt(AdverbialClause.length)];

    }

    public static String generatePossessive() {
        return Possessive[rand.nextInt(Possessive.length)];
    }

    public static String generateMainClause() {
        return MainClause[rand.nextInt(MainClause.length)];
    }

    public static String generateAdverbialClause() {
        return AdverbialClause[rand.nextInt(AdverbialClause.length)];
    }

}


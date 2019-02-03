package tech.verenti.support;

import java.util.Random;

public class PayLoad {

    public PayLoad() {
    }

    private static String[] Possessive = {"my", "her", "his", "Des Lynam's", "Bernard Cribbins'", "Brian Cant's"};

    private static String[] MainClause = {"father", "mother", "brother", "sister"};

    private static String[] AdverbialClause = {"cooked a nice meal of dumplings and custard", "rode to the post office", "rode the winner at the 14:50 at Thirsk",
            "rode Apollo Avenger at the 13:20 at Chepstow", "became agitated when their football was stolen", "decided not to drown the kittens after all", "ate their meal with indecent haste", "fought Mohammed Ali and won",
    "is a world leading expert on firearms", "invented the self inflating air-bed", "scored the winning goal in the 1958 cup final", "replaced Jeff Pinkus on bass in Melvins", "invented the steam duvet", "says: You Can't Judge a Book By Its Cover" };

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


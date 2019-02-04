package tech.verenti.support;

import java.util.Random;

public class PayLoad {

    public PayLoad() {
    }

    private static String[] Structure = {"Here is an example of the past continuous: "};

    private static String[] Possessive = {"my", "her", "his", "Des Lynam's", "Bernard Cribbins'", "Brian Cant's"};

    private static String[] MainClause = {"Father", "Mother", "Brother", "Sister"};

    private static String[] AdverbialClause = {"cooked a nice meal of dumplings and custard", "rode to the post office", "rode the winner at the 14:50 at Thirsk",
            "rode Apollo Avenger at the 13:20 at Chepstow", "became agitated when their football was stolen", "decided not to drown the kittens after all", "ate their meal with indecent haste", "fought Mohammed Ali and won",
            "is a world leading expert on firearms", "invented the self inflating air-bed", "scored the winning goal in the 1958 cup final", "replaced Jeff Pinkus on bass in Melvins", "invented the steam duvet", "says: You Can't Judge a Book By Its Cover"};

    private static String[] FreeFormSentence = {"Bees blew like cake-crumbs through the golden air, white butterflies like sugared wafers, and when it wasn't raining a diamond dust took over which veiled and yet magnified all things",
                                                "She leaned out of the window slow and sleepy, and the light came through her nightdress like sand through a sieve.",
                                                "Smiler was a manic farmer...he was a melancholic with a loathing for mankind...some paralysis had twisted his mouth into a permanent smile. Everyone he met, being warmed by his smile, would shout him a happy greeting. Beaming upon them he would curse them all to hell.",
                                                "We carried cut hay from the heart of the rick, packed tight as tobacco flake, with grass and wild flowers juicily fossilized within \u2013 a whole summer embalmed in our arms.",
                                                "I was Mr Wet Underpants in eighty-nine. Titled by accident more than design. And I'll tell you stuff for nothing I'll tell you it for free Shawshank Redemption, five quid, HMV",
                                                "Can't you see? A butterfly stomach round ground. I drank a jar of coffee. And then I took some of these. And I'm totally wired",
                                                "And in the scout hut debate still rages on, the most dangerous junction in Christendom, and Cathy Staniforth\u2019s milk bank opens soon, yonder the deacon in misguided trousers.",
                                                "Rehearsals afoot for the Christmas Play, it’s called “Roll The Square Arthur” and mind what you say, it’s a cricketing farce with a thickening plot, Act One, Scene One – Brenda Blethyn gets shot",
                                                "Four o-six and I'm wide awake, got an uncontrollable urge to take, a five mile hike around the Ogwen Lake; stretch these restless legs",
                                                "Milky drink and Sudafed, \u201Cthat should sort you out\u201D, she said, as I kicked myself clean out of the bed; grazed my restless legs.",
                                                "Checkmate! Dennis Bell of Torquay, too late, with your Nxe3, good game sir, do you want another bout? Well Dennis ain\u2019t replying cos he just signed out, Bad losers on Yahoo Chess, Bad losers on Yahoo Chess, Bad losers on Yahoo Chess."};
    private static Random rand = new Random();

    public static String generateStructuredSentence() {
        return Possessive[rand.nextInt(Possessive.length)] + " " +
                MainClause[rand.nextInt(MainClause.length)] + " " +
                AdverbialClause[rand.nextInt(AdverbialClause.length)];

    }

    public static String generateFreeFormSentence() {
        return FreeFormSentence[rand.nextInt(FreeFormSentence.length)];

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


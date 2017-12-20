package datatest;

public class nba {
    public static void main(String[] args) {

        /*
        Homework: one
        1. Create and Array with list of all NBA teams
        2. Print length of the array
        3. Printout team "knicks" and convert it to uppercase
        */
        String[] nba = new String[15];
        nba[0] = "Boston";
        nba[1] = "Toronto";
        nba[2] = "Detroit";
        nba[3] = "Cleveland";
        nba[4] = "Washington";
        nba[5] = "New York Knicks";
        nba[6] = "Phiadelphia";
        nba[7] = "Indiana";
        nba[8] = "Milwaukee";
        nba[9] = "Orlando";
        nba[10] = "Charlotte";
        nba[11] = "Miami";
        nba[12] = "Brooklyn";
        nba[13] = "Chicago";
        nba[14] = "Atlanta";

        int nbaEast = nba.length;
        System.out.println("NBA Eastern Division has " + nbaEast + " teams.");
        System.out.println(nba[5].toUpperCase());
        System.out.println(" ");




                /*Homework two:
                1. Create an Array with all players from knicks
                2. Create an Aarray with all players from nets
                3. compare both array
                */
        String [] Knicks = {"Tim Hardaway Jr.", "Kristaps Porzingis", "Enes Kanter", "Courtney Lee", "Jarrett Jack"};
        String[] Nets = {"DeMarre Caroll", "Rondae Hollis-Jefferson", "Tyler Zeller", "Allen Crabbe", "Spencer Dinwiddle"};
        boolean NYteamsAlike = Knicks.equals(Nets);//Compare the 2 teams
        System.out.println("The Knicks and Nets have the same Starting lineup: " + NYteamsAlike);

    }
}

package enums;


//enum Season {
//    SUMMER,
//    WINTER,
//    AUTMN,FALL
//}


enum COIN {
    PENNY(1),
    NICKEL(5),
    DIME(10);

    private final int value; // making immutable
    COIN(int value) {this.value = value;}
    public int getValue() {return this.value;}
//    public void setCoint(int value) {this.value = value;}
}
public class EnumsPractice {

    private Season season;

    public String getSeason() {
        return season.name();
    }

    public void setSeason(String season) {
        this.season = Season.valueOf(season);
    }

    public static void main(String[] args) {
        int value = COIN.DIME.getValue();
        System.out.println(value);
    }


    enum Season {
        SUMMER,
        WINTER,
        AUTMN,FALL
//        ,FALL  NO duplicates allowed...
    }
}

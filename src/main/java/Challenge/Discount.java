package Challenge;

public enum Discount {
    OWNER("주인", 10),
    SOLDIER("군인", 5),
    STUDENT("학생", 3),
    CITIZEN("일반", 0);

    private final String who;
    private final double disc;

    Discount(String who, double disc) {
        this.who = who;
        this.disc = disc;
    }

    public String getWho() {
        return who;
    }

    public double getDisc() {
        return disc;
    }
}

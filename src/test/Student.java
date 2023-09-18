package test;

public class Student {

    enum LEVEL {HIGH, MID, LOW}

    private String name;
    boolean male;
    private int hak;
    private int ban;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", male=" + male +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return male;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, boolean male, int hak, int ban, int score) {
        this.name = name;
        this.male = male;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }
}

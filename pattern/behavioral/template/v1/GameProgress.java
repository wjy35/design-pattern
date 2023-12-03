package behavioral.template.v1;

public interface GameProgress {
    void play();

    void waitMember();
    void round(String member);
    void calculateGrade();
    void reflectRank();
}

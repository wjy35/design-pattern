package behavioral.template;

import java.util.List;

public abstract class GameProgressTemplate {
    private List<String> gameMemberList;

    public final void play(){
        waitMember();

        for(String member: gameMemberList){
            round(member);
        }

        calculateGrade();
        reflectRank();
    }

    private void waitMember(){
        System.out.println("게임 시작 대기!");
    }

    protected abstract void round(String member);

    protected abstract void calculateGrade();

    protected abstract void reflectRank();

    public GameProgressTemplate(List<String> gameMemberList) {
        this.gameMemberList = gameMemberList;
    }
}

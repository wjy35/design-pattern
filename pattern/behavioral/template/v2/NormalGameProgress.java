package behavioral.template.v2;

import behavioral.template.v2.GameProgressTemplate;

import java.util.List;

public class NormalGameProgress extends GameProgressTemplate {
    public NormalGameProgress(List<String> memberList) {
        super(memberList);
    }

    @Override
    protected void round(String member) {
        System.out.println(member+"님 차례 입니다.");
    }

    @Override
    protected void calculateGrade() {
        System.out.println("일반 게임 점수 산정");
    }

    @Override
    protected void reflectRank() {
        System.out.println("일반 게임 랭크 반영");
    }
}

package behavioral.template.v2;

import java.util.List;

public class ItemGameProgress extends GameProgressTemplate {
    public ItemGameProgress(List<String> memberList) {
        super(memberList);
    }

    @Override
    protected void round(String member) {
        System.out.println(member+"님 차례 입니다.");
        System.out.println(member+"님 아이템 사용!");
    }

    @Override
    protected void calculateGrade() {
        System.out.println("아이템전 점수 산정");
    }

    @Override
    protected void reflectRank() {
        System.out.println("아이템전 랭크 반영");
    }
}

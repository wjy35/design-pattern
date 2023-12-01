package behavioral.template.main;

import behavioral.template.GameProgressTemplate;
import behavioral.template.ItemGameProgress;
import behavioral.template.NormalGameProgress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> gameMemberList = new ArrayList<>();
        gameMemberList.add("jy0305");
        gameMemberList.add("hi0516");

        GameProgressTemplate game = null;
        System.out.println("일반 게임:1   랭크 게임:2 번을 눌러주세요!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if(input==1){
            game = new NormalGameProgress(gameMemberList);
        }else{
            game = new ItemGameProgress(gameMemberList);
        }

        game.play();
    }
}

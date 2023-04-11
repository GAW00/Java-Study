package Programmers_lv0;

import java.util.Arrays;

public class lv0_CharacterCoordinate {
	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11, 11};
		System.out.println(Arrays.toString(solution(keyinput, board)));
	}
	
	public static int[] solution(String[] keyinput, int[] board) {
		int x = 0, y = 0;
		int vertical_limit = board[1] / 2, horizontal_limit = board[0] / 2;
		for(String dir : keyinput) {
			if(dir.equals("up")) y += y >= vertical_limit ? 0 : 1;
			else if(dir.equals("down")) y -= y <= -1 * vertical_limit ? 0 : 1;				
			else if(dir.equals("left")) x -= x <= -1 * horizontal_limit ? 0 : 1;
			else if(dir.equals("right")) x += x >= horizontal_limit ? 0 : 1;
		}
		int[] coo = {x, y};
        return coo;
    }
}

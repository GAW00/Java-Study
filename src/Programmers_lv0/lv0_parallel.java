package Programmers_lv0;

public class lv0_parallel {
	public static void main(String[] args) {
		int[][] arr = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		int[][] arr2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
		
		System.out.println(solution(arr2));
	}
	
	// ���� �� �ڵ�
	public static int solution(int[][] dots) {
        // 1) �� ���� ¦ ����
		// 2) ���� ��
		// 3) ������  1 return
        for(int i = 0; i < dots.length; i++) {
        	for(int j = i + 1; j < dots.length; j++) {
        		for(int k = 0; k < dots.length; k++) {
    				if(k != j && k != i) {
    					for(int l = 0; l <dots.length; l++) {
    						if(l != k && l != j && l != i) {
//		        				System.out.print(i);
//		        				System.out.print(j);
//		        				System.out.print(k);
//		        				System.out.println(l);
//    							System.out.println((dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]));
//    							System.out.println((dots[k][1] - dots[l][1]) / (dots[k][0] - dots[l][0]));
        						if((double)(dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]) == (double)(dots[k][1] - dots[l][1]) / (dots[k][0] - dots[l][0])) {
        							return 1;
        						}
    						}
    					}
    				}
        		}
        	}
        }
        return 0;
    }
	// ���α׷��ӽ� ����
	/*
	 * import java.lang.Math;
class Solution {
    private int xPos = 0;
    private int yPos = 1;
    private int[][] checkCases = {{0, 1, 2, 3}, {0, 2, 1, 3}, {0, 3, 1, 2}}; // �³�.. 3���ۿ� ����..
    public int solution(int[][] dots) {
        int answer = 0;
        for (int[] checkCase : checkCases) {
            if (checkParallel(checkCase, dots)) {
                answer = 1;
                break;
            }
        }

        return answer;
    }

    private boolean checkParallel(int[] checkCase, int[][] dots) {
        int xPos1 = dots[checkCase[0]][xPos];
        int yPos1 = dots[checkCase[0]][yPos];
        int xPos2 = dots[checkCase[1]][xPos];
        int yPos2 = dots[checkCase[1]][yPos];
        int xPos3 = dots[checkCase[2]][xPos];
        int yPos3 = dots[checkCase[2]][yPos];
        int xPos4 = dots[checkCase[3]][xPos];
        int yPos4 = dots[checkCase[3]][yPos];
        // (y4 - y3)(x2 - x1) - (x4 - x3)(y2 - y1) ���࿩�� ����
        int chk = ((yPos4 - yPos3) * (xPos2 - xPos1)) - ((xPos4 - xPos3) * (yPos2 - yPos1));
        if (chk == 0) {
            return true;
        }
        return false;
    }
}
	 */
	
	
}

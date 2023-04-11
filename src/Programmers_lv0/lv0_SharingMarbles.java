package Programmers_lv0;

public class lv0_SharingMarbles {
	public static void main(String[] args) {
		int balls = 30, share = 30;
		System.out.println(solution(balls, share));
	}
	
	public static int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
	
//	public static int solution(int balls, int share) {
//		try {
//			return factorial(balls) / (factorial(balls - share) * factorial(share));
//		}catch(Exception e) {
//			System.out.println("오류 B");
//			return 0;
//		}
//    }
//	
//	public static int factorial(int n) {
//		if(n == 0) return 1;
//		else if (n == 1) return n;
//		else return factorial(n-1) * n;
////		if(n == 0) return 1;
////		else if(n == 1) return n;
////		else if(n > 1){
////			n *= factorial(n - 1);
////			return n;
////		}
////		else {
////			System.out.println("오류 A");
////			return 0;
////		}
//	}
}

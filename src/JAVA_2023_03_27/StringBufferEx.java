package JAVA_2023_03_27;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);		// "This"
		
		sb.append(" is pencil");	// append(str) : sb에 str을 연결(추가되면서 수정됨)
		System.out.println(sb);		// "This is pencil"
		
		sb.insert(7,  " my");		// insert(index, str) : index위치에 str삽입
		System.out.println(sb);		// "This is my pencil"
		
		sb.replace(8, 10, "your");	// replace(index1, index2, str) : index1 이상, index2 미만의 범위의 스트링을 str로 대체
		System.out.println(sb);		// "This is your pencil"
		
		sb.delete(8, 13);			// delete(index1, index2) : index1 이상, index2 미만의 범위의 스트링을 삭제 
		System.out.println(sb);		// "This is pencil"
		
		sb.setLength(4);			// setLength(index) : 인덱스 0부터 index까지의 범위로 StringBuffer의 크기를 재설정
									// (현재 길이보다 길면 Null로, 짧으면 기존 문자열이 잘림)
		System.out.println(sb);		// "This"
		
		sb.reverse();				// 문자열 뒤집기
		System.out.println(sb);		// "sihT"
	}
}


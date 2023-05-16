package Project_CSI;

import java.util.*;

class Course {
	String title, time, room;
	Faculty lecturer;
	//Student regist[]; //not used
	Vector vregist;	  //-> Vector<Student> regist;
	
	Course(){
		//regist=new Student[10]; //not used
		vregist = new Vector();
	}
	Course(String nam, Faculty prof, String tim, String rum){
		this();
		title = nam; time = tim; room = rum;
		lecturer = prof;
		prof.openCourse(this);
	}
	String getTitle() {return title;}
	Faculty getLecturer() {return lecturer;}
	
	String getTP() {return time+" #"+room;}

	int numRegist() {return vregist.size();} // 수강생 수?
	void register(Student st) {vregist.add(st);} // 수강등록!
	void dropme(Student st) {vregist.removeElement(st);} // 수강취소
	void listRegistrants() {
		for(int i=0;i<vregist.size();i++){
			Student st=(Student)vregist.elementAt(i);
			System.out.print(st.getName());
			System.out.print(" "); //1
			for(int j=0;j<16;j++)System.out.print("  .");//2
			if((i+1)%5==0) {
				System.out.print("\n     "); //공백 7-4자
				for(int j=0;j<16;j++)System.out.print(" --");
			}
			System.out.println("");
		}
	}//*-출석부 명단 출력
	void info() {
		System.out.println(title+"담당교수: "+lecturer.getName() +", 시간: "+time+", 강의실: "+room);
	}
}

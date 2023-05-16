package Project_CSI;

public class InheritanceDemo {
        int npp = 0;
        Person[] ppv; //person의 벡터(배열)
        Student[] stv; //student의 벡터
        Faculty[] profv; //professor의 벡터
        Staff[]  jigwon;
        Course crsv[];
        //Vector<Course> crsv;

    /*public static void main(String[] args){
	Person[] p = new Person[3];
	Student st = new Student("홍길동", 24, 3, 200811723, "IT융합응용공학");
	Faculty pf = new Faculty("김교수", 48, "부산시 남구", 4000000, "공과대학");
	pf.setCourse("Java 프로그래밍");
	Staff tf = new Staff("박과장", 42, 3000000, "대학본부");
	tf.setDepartment("서무과");

	p[0] = st;
	p[1] = pf;
	p[2] = tf;

	for(int i = 0; i < p.length; i++) {
	      System.out.println("<"+ (i+1) +">------------------------------");
	      p[i].info();
	}
    }*/

    public static void main(String[] args){
    	InheritanceDemo pcis = new InheritanceDemo();
    	pcis.recruit_employees();
    	pcis.run_school();
    	pcis.report();
    }
    
    InheritanceDemo() {
        ppv = new Person[100]; npp = 0;
    }

    void recruit_employees() {
    	profv=new Faculty[3];
    	profv[0]=new Faculty("김교수",48,"부산시 남구",5000000,"공과대학");
    	profv[1]=new Faculty("박교수",38,"부산시 해운대구",4000000,"공과대학");
    	profv[2]=new Faculty("최교수",45,"부산시 수영구",4500000,"공과대학");
    	jigwon=new Staff[2];
    	jigwon[0]=new Staff("박과장",43,"이탈리아",4000000,"대학본부");
    	jigwon[0].setDepartment("서무과");
    	jigwon[1]=new Staff("이대리",35,"러시아",3200000,"대학본부",jigwon[0]);
    	jigwon[1].setDepartment("행정과");
    	
    	ppv[npp++]=profv[0];
    	ppv[npp++]=profv[1];
    	ppv[npp++]=profv[2];
    	ppv[npp++]=jigwon[0];
    	ppv[npp++]=jigwon[1];
    }

    void report() {	// 구성원 소개, 수강편람, 과목출석부, 개인 시간표
    	print_people();
    	print_수강편람();
    	for(int i=0;i<crsv.length;i++)
    		print_출석부(crsv[i]);
    	for(int i=0;i<stv.length;i++)
    		print_학생시간표(stv[i]);
    }
    
    void run_school() { // 개강후 학생의 학생의 재학, 강의 개설, 강의 등록을 나타내는 메소드
    	recruit_학생();
    	open_강좌();
    	register_수강과목();
    }
    
    void recruit_학생() {	// (1)'
        String namev[] = {"AAA", "BBB", "CCC", "DDD", "EEE","FFF", "GGG", "HHH", "III", "JJJ"};
        int agev[] = {21, 24, 22, 19, 21, 21, 21, 21, 23, 21};
        String addressv[]= {"서울특별시","대전광역시","대구광역시","부산광역시","울산광역시","광주광역시","인천광역시","제주특별자치도","독도","뉴욕"};
        stv=new Student[namev.length];
        for(int i=0;i<namev.length;i++) {
        	stv[i]=new Student(namev[i],agev[i],addressv[i],3,201712345+i,"IT융합응용공학");
        	ppv[npp++]=stv[i];
        }
        
    }

    void open_강좌() {
    	crsv=new Course[3]; //두 과목만 개설, 이름 = 8자.
    	crsv[0]=new Course("Java   ",profv[0],"Mon 7-8 / Wed 1-2","2226");
    	profv[0].setCourse("Java   ");
    	crsv[1]=new Course("Grapics",profv[1],"Wed 7-8 / Thu 7-8","1325");
    	profv[1].setCourse("Grapics");
    	crsv[2]=new Course("OS     ",profv[2],"Tue 4-6 / Fri 2-3","2048");
    	profv[2].setCourse("OS     ");
    }

    void register_수강과목() {
    	Course oo=crsv[0];
    	Course cg=crsv[1];
    	Course os=crsv[2];
    	int oo_list[]= {0,1,3,4,5,7}; //oo과목 신청자
    	int cg_list[]= {2,3,5,6}; //cg과목 신청자
    	int os_list[]= {0,2,3,4,5,8,9}; //os과목 신청자
    	for(int i=0;i<oo_list.length;i++)
    		stv[oo_list[i]].registerCourse(oo);
    	for(int i=0;i<cg_list.length;i++)
    		stv[cg_list[i]].registerCourse(cg);
    	for(int i=0;i<os_list.length;i++)
    		stv[os_list[i]].registerCourse(os);
    	System.out.println("수강신청: "+(oo_list.length+cg_list.length)+"회 - 성공.");
    }

    void print_people() {
        for(int i = 0; i < npp; i++){
            System.out.println("<" + (i + 1) + ">---------------------------");
            ppv[i].info();
        }
    }

    void print_수강편람() {
    	System.out.println("\n- 수강 편람 -");
    	for(int i=0;i<crsv.length;i++)crsv[i].info();	
    }

    void print_출석부(Course cs) {
    	System.out.println("--------------------------------------------------------");
    	System.out.println("과목: "+cs.getTitle()+"("+cs.getTP()+")"+" 담당교수: "+cs.lecturer.getName());
    	System.out.print("     "); //공백 8-4자
    	for(int i=1; i<=16;i++)System.out.printf("%3d",i);
    	System.out.println("");
    	cs.listRegistrants();
    }

    void print_학생시간표(Student st) {
    	System.out.println("\n<< 수강과목/시간표 >>");
    	System.out.println("이름: "+st.getName());
    	
    	for(int i=0;i<st.nCourses;i++) {
    	Course c=st.getCourse(i);
    			System.out.println(c.getTitle()+"("+c.getTP()+") by "+c.lecturer.getName());
    	}
    }

}


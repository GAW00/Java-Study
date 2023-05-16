package Project_CSI;

// 리스트 5.4 : Faculty.java
// Faculty 클래스는 Employee 클래스를 상속받는데 Employee 클래스의 멤버 변수와 멤버 메소
// 드를 가지고 있으며 Employee 클래스의 슈퍼 클래스들의 멤버 변수와 멤버 메소드를 가지고 
// 있다. 또한 새로운 변수(course)를 정의하고 그 변수에 접근 가능한 메소드를 가지고 있다.

class Faculty extends Employee{
    private String course; // 과목
    // $
	Course coursev[]=new Course[2];
	int nCourses=0;
    // 다양한 생성자
    Faculty(){
        super();
        course = "Not yet";
    }
    Faculty(String name, int age, int salary, String position){
        super(name, age, salary, position);
        course = "Not yet";
    }
    Faculty(String name, int age, String address, int salary, String position){
        super(name, age, address, salary, position);
        course = "Not yet";
    }
    Faculty(String name, int age, int salary, String position, Employee supervisor){
        super(name, age, salary, position, supervisor);
        course = "Not yet";
    }
    Faculty(String name, int age, String address, int salary, String position, 
           Employee supervisor){
        super(name, age, address, salary, position, supervisor);
        course = "Not yet";
    }

    // $$
	void openCourse(Course c) {
		//any check?
		coursev[nCourses++]=c;
	}
    // 데이터 접근을 위한 메소드
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }

    // 객체 정보 표시
    public void info(){
        super.info();
        System.out.println("강의 : " + course);
    }
}

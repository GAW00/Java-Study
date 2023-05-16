package Project_CSI;

// 실습5.3 : Employee.java
// Person을 상속받은 Employee 클래스는 Person 클래스의 모든 멤버 변수와 멤버 메소드를 가지
// 고 있으며 새로운 변수들(salary, position, supervisor)을 설정하고 접근할 수 있는 메소드가 정의 
// 되어있다. supervisor 변수는 특히 Employee 타입인데 직원들이 있으면 그 직원의 상사(또한 직 
// 원)을 나타낸다.

class Employee extends Person {
    private int salary;         //급여
    private String position; //소속 (eg.: 공과대학 컴퓨터공학부, 총무과)
    private Employee supervisor;   //직속 상사
    
    // 다양한 생성자.
    Employee(){
        super();
        salary = 0;
        position = "Not yet";
        supervisor= null;
    }
    Employee(String name, int age, int salary, String position){
        super(name, age);
        this.salary = salary;
        this.position = position;
    }
    Employee(String name, int age, String address, int salary, String position){
        super(name, age, address);
        this.salary = salary;
        this.position = position;
    }
    Employee(String name, int age, int salary, String position, Employee supervisor){
        super(name, age);
        this.salary = salary;
        this.position = position;
        this.supervisor = supervisor;
    }
    Employee(String name, int age, String address, int salary, String position, 
              Employee supervisor){
        super(name, age, address);
        this.salary = salary;
        this.position = position;
        this.supervisor = supervisor;
    }
	
    // 데이터 접근을 위한 메소드들
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
    public void setSupervisor(Employee supervisor){
        this.supervisor = supervisor;
    }
    public Employee getSupervisor(){
        return supervisor;
    }

    // 객체 정보 표시
    public void info(){
        super.info();
        System.out.println("급여 : " + salary);
        System.out.println("소속 : " + position);
        if(supervisor != null)
            System.out.println("상사 : " + supervisor.getName());
    }
}

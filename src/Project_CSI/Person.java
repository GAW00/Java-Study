package Project_CSI;

class Person{
    private String name; // 이름
    private int age; // 나이
    private String address; // 주소

    // 다양한 생성자
    Person(){
        name = "No name yet.";
        age = 0;
        address = "";
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
        address = "";
    }
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
	
    // 데이터 접근을 위한 메소드들
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    // 객체 정보 표시
    public void info(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
    }
}

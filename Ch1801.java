public class Ch1801 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shivam";
        s1.cgpa(30, 30,36);
        System.out.println(s1.result);
    }
    
}

class Student{
    String name;
    int age;
    float result;

    void cgpa(int phy, int che, int math){
        result = (phy+che+math)/3;
    }
}

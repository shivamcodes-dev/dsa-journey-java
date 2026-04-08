public class Ch1802 {
    public static void main(String[] args) {
        Student s1 = new Student("Shivam", 15);
        System.out.println();

        String q1 = "Shivam";
        System.out.println(q1.intern());
        ;

    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

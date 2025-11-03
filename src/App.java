public class App {
    public static void main(String[] args) {

        Person teacher1 = new Teacher("Miss. Michel", 28, "Math");
        Person student1 = new Student("Kumar", 16, 11);
        

        System.out.println("Teacher Introduction:");
        teacher1.introduce();

        System.out.println("\nStudent Introduction::");
        student1.introduce();
    }
}

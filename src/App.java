public class App {
    public static void main(String[] args) {

        Person teacher1 = new Teacher("Miss. Michel", 28, "Math");
        teacher1.introduce();

        System.out.println();

        Person student1 = new Student("Kumar", 16, 11);
        student1.introduce();
    }
}

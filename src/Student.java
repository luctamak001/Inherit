public class Student extends Person {

    int gradeLevel;

    public Student(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }


    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm in " + this.gradeLevel + " grade.");

        }
}

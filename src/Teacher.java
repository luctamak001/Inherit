public class Teacher extends Person {

    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a " + this.subject + " teacher");
    }
}

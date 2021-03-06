package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String greeting = super.introduce() + " I am a Teacher. ";

        if (klass != null) {
            greeting += "I teach " + klass.getDisplayName() + ".";
        } else {
            greeting += "I teach No Class.";
        }

        return greeting;
    }

    public String introduceWith(Student student) {
        String greeting = super.introduce() + " I am a Teacher. ";

        if (student.getKlass().getNumber() == klass.getNumber()) {
            greeting += "I teach " + student.getName() + ".";
        } else {
            greeting += "I don't teach " + student.getName() + ".";
        }

        return greeting;
    }
}
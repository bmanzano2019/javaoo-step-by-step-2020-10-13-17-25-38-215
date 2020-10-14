package practice06;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String greeting = super.introduce() + " I am a Teacher. ";

        if (klass != null) {
            greeting += "I teach Class " + klass + ".";
        } else {
            greeting += "I teach No Class.";
        }

        return greeting;
    }
}

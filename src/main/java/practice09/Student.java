package practice09;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String greeting = super.introduce() + " I am a Student. ";

        if (klass.getLeader() == null) {
            greeting += "I am at Class " + klass.getNumber() + ".";
        }
        else if (klass.getLeader().getId() == super.getId()) {
            greeting += "I am Leader of Class " + klass.getNumber() + ".";
        } else {
            greeting += "I am at Class " + klass.getNumber() + ".";
        }

        return greeting;
    }
}
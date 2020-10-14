package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String greeting = super.introduce() + " I am a Teacher. ";

        if (classes.size() != 0) {
            greeting += "I teach Class "
                    + classes.stream().map(klass -> klass.getNumber().toString())
                    .reduce("", (result, classNum) -> {
                        if (result.equals("")) {
                            return classNum;
                        } else {
                            return result + (", " + classNum);
                        }
                    })
                    + ".";
        } else {
            greeting += "I teach No Class.";
        }

        return greeting;
    }

    public String introduceWith(Student student) {
        String greeting = super.introduce() + " I am a Teacher. ";

        if (isTeaching(student)) {
            greeting += "I teach " + student.getName() + ".";
        } else {
            greeting += "I don't teach " + student.getName() + ".";
        }

        return greeting;
    }

    public boolean isTeaching(Student student) {
        return classes.stream().anyMatch(klass -> klass.isIn(student));
    }
}

package school;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Возраст студента должен быть не менее 18 лет!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Студент: " + name + ", возраст: " + age;
    }
}

import school.School;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent("Айткалиев Елдос", 19);
        school.addStudent("Данияр", 17);
        school.addStudent("Алия", 20);

        school.printStudents();
    }
}

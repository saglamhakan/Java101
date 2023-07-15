package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {


        Teacher teacherOne = new Teacher("Ekici", "123", "Tarih");
        Teacher teacherTwo = new Teacher("Yasir","234","Fizik");
        Teacher teacherTree = new Teacher("Hakkı", "345", "Kimya");

        Course tarih = new Course("Tarih", "1", "Tarih", teacherOne);
        tarih.addTeacher(teacherOne);

        Course fizik = new Course("Fizik", "2", "Fizik", teacherTwo);
        fizik.addTeacher(teacherTwo);

        Course kimya = new Course("Kimya", "3", "Kimya", teacherTree);
        kimya.addTeacher(teacherTree);


        Student student1 = new Student("Mert", "10", 4, tarih, fizik, kimya);
        student1.addBulkExamNote(50,50,50);
        student1.printNote();
        student1.isPass();

        Student student2 = new Student("Mete", "20", 4, tarih, fizik, kimya);
        student2.addBulkExamNote(60,60,80);
        student2.printNote();
        student2.isPass();

        Student student3 = new Student("Ato", "30", 4, tarih, fizik, kimya);
        student3.addBulkExamNote(50,60,70);
        student3.printNote();
        student3.isPass();


    }






}

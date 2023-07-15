package StudentInformationSystem;

public class Student {
    Course courseOne;
    Course courseTwo;
    Course courseTree;

    String name;
    String studentNumber;
    int classes;
    double avarage;
    boolean isPass;

    Student (String name, String studentNumber, int classes, Course courseOne, Course courseTwo, Course courseTree ) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.courseOne = courseOne;
        this.courseTwo = courseTwo;
        this.courseTree = courseTree;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int noteOne, int noteTwo, int noteTree) {
        if(noteOne >= 0 && noteOne <= 100) {
            this.courseOne.note = noteOne;
        }

        if(noteTwo >= 0 && noteTwo <= 100) {
            this.courseTwo.note = noteTwo;
        }

        if (noteTree >= 0 && noteTree <= 100) {
            this.courseTree.note = noteTree;
        }

    }

    public void isPass() {
        this.avarage = (courseOne.note + courseTwo.note + courseTree.note ) / 3.0;
        if (this.avarage > 55){
            System.out.println("Ortalama : " + this.avarage +"\nGeçti\n");
        }else {
            System.out.println("Ortalama : " + this.avarage + "\nKaldı.\n");
        }

    }

    public void printNote() {
        System.out.println("Öğrenci : " + this.name);
        System.out.println(courseOne.name + " Notu :" + courseOne.note);
        System.out.println(courseTwo.name + " Notu :" + courseTwo.note);
        System.out.println(courseTree.name + " Notu :" + courseTree.note);

    }



}

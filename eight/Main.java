package eight;

import java.util.List;

public class Main {
    public static void main(String[] args)  {
        ReaderStudent file = new ReaderStudent("C:/Users/BC/Downloads/students.csv");
        ReaderGrade file1 = new ReaderGrade("C:/Users/BC/Downloads/grades.csv");
        List<Student> fileData = file.getData();
        List<Grade> fileData1 = file1.getData1();

        StudentGradeProcessor.Info(fileData,fileData1);
        System.out.println("----------------------------");
        StudentGradeProcessor.Avarage(fileData,fileData1);
        System.out.println("----------------------------");
        StudentGradeProcessor.AvaragePerformance(fileData,fileData1);
    }
}



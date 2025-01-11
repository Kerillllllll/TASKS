package eight;


import java.util.*;

public class StudentGradeProcessor {

    public static void Info(List<Student> fileData, List<Grade> fileData1){

            for (Student stud: fileData) {
                List<Integer> grades = new ArrayList<Integer>();
                for (Grade grade : fileData1) {
                    if (stud.getId() == grade.getStudentId()) {
                        grades.add(grade.getGrade());
                    }
                }
                System.out.println(stud.toString());
                System.out.println("Оценки " + grades);
            }
    }

    public static void Avarage(List<Student> fileData, List<Grade> fileData1){

        for (Student stud: fileData) {
            List<Integer> grades = new ArrayList<Integer>();
            for (Grade grade : fileData1) {
                if (stud.getId() == grade.getStudentId()) {
                    grades.add(grade.getGrade());
                }
            }
                    double sum = 0;
                    for (int num : grades) {
                        sum += num;
                    }
                    double average = sum / grades.size();
                    System.out.println(stud.toString() + " Средняя оценка " + average);
                }
            }
    public static void AvaragePerformance(List<Student> fileData, List<Grade> fileData1){

        for (Student stud: fileData) {
            List<Integer> grades = new ArrayList<Integer>();
            for (Grade grade : fileData1) {
                if (stud.getId() == grade.getStudentId()) {
                    grades.add(grade.getGrade());
                }
            }
            double sum = 0;
            for (int num : grades) {
                sum += num;
            }
            double average = sum / grades.size();

            if ( 4.3 <= average && average <= 4.7){
                System.out.println(stud.toString() + " Входит в диапозон средней успеваемости(от 4.3 до 4.7)");
                System.out.println("Его средняя оценка " + average);
            }
        }
    }
}

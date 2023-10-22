import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupControler controler = new StudentGroupControler();
        Student student1 = controler.createStudent("5","5", "5", 1, 5);
        Student student2 = controler.createStudent("2","2", "2", 2, 3);
        Student student3 = controler.createStudent("3","3", "3", 3, 4);
        System.out.println(student1.compareTo(student2));
        List<Student> studentList= List.of(new Student[]{student1, student2, student3});
        controler.createStudentGroup(studentList);
        controler.print();
        System.out.println("Cортировка(SrBall)...");
        controler.print(controler.sortedStudentGroupBySrBall());
        System.out.println("Cортировка(FIO)...");
        controler.print(controler.sortedStudentGroupByFIO());

        StudentGroup g1 = new StudentGroup(new ArrayList<>());
        StudentGroup g2 = new StudentGroup(new ArrayList<>());
        Stream stream = new Stream();
        stream.addStudentGroup(g1);
        stream.addStudentGroup(g2);

        Stream stream1 = new Stream();
        Stream stream2 = new Stream();
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        System.out.println("Поток содержит учебных групп:  " + stream.getGroupList().size());
        controler.sortStreams(streams);

        for (Stream s : streams) {
            System.out.println( s.getGroupList().size());
        }
    }
}
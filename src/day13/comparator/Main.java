package day13.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static day07.util.Utility.makeLine;

public class Main {
    public static void main(String[] args) {

/*
        List<Student> studentList = List.of(
                new Student("송철수", 15, 79)
                , new Student("박영희", 17, 41)
                , new Student("손흥민", 11, 11)
                , new Student("감우성", 25, 34)
        );

         List.of 로 배열을 만들어두면 수정 불가함.
         studentList.add(new Student("zzz", 1, 16));
*/

        // 배열을 수정하려면 이런 식으로 ArrayList 로 처리하면 된다
        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("송철수", 15, 79)
                        , new Student("박영희", 17, 41)
                        , new Student("손흥민", 11, 11)
                        , new Student("감우성", 25, 34)
                )
        );

        // 나이 순으로 오름차 정렬 (나이 적은순)
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        studentList.forEach(s -> System.out.println(s));


        makeLine();
        // 이름 가나다 순으로 오름차 정렬
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        studentList.forEach(s -> System.out.println(s));

        makeLine();

        // 람다로 바꿔두기
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        studentList.forEach(s -> System.out.println(s));
    }
}

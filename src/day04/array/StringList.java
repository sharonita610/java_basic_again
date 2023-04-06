package day04.array;


import java.util.Arrays;

// 스트링 배열을 제어하는 설계도
public class StringList {

    //필드

    private String[] sArr;


    //생성자
    public StringList() {
        sArr = new String[0];

    }

    public String[] getsArr() {
        return sArr;
    }

    public void setsArr(String[] sArr) {
        this.sArr = sArr;
    }

    public StringList(String... initData) {
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }

    // 메서드
    // 배열에 저장된 데이터 수를 알려주는 기능

    public int size() {
        return sArr.length;
    }

    // 배열에 맨 끝에 데이터를 추가하는 기능

    public void push(String newData) {
        String[] temp = new String[sArr.length + 1];

        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length - 1] = newData;
        sArr = temp;
    }

    // 배열 맨 끝 데이터 사제하는 기능
    public String pop() {
        String deleteTarget = sArr[sArr.length - 1];
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
        return deleteTarget;
    }

    // 배열 내부데이터 출력

    public String toString() {
        return Arrays.toString(sArr);
    }


    // 배열이 텅텅비었는지 확인

    public boolean isEmpty() {
        return sArr.length == 0;
    }


    // 배열 데이터 전체 삭제
    public void clear() {
        sArr = new String[0];
    }

    //index 탐색


    // 자료유무확인

    //중간삭제

    // 중간삽입

}

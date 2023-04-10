package day10.practicingAlone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 동물병윈.
public class AnimalHostpital {

    //=======================================================
    // key : 동물 이름, value : 동물 객체
    private static Map<String, Animal> animalList; // 동물 배열

    static {
        animalList = new HashMap<>();
    }

    public static Map<String, Animal> getAnimalList() {
        return animalList;
    }

    public static void setAnimalList(Map<String, Animal> animalList) {
        AnimalHostpital.animalList = animalList;
    }

    // 동물들 대기 배열
    private static List animalWaitingList;

    public static List getAnimalWaitingList() {
        return animalWaitingList;
    }

    public static void setAnimalWaitingList(List animalWaitingList) {
        AnimalHostpital.animalWaitingList = animalWaitingList;
    }
    //=======================================================


    // 1-1 처음 진료 접수하는 동물 함수
    public void newAnimalInscription(Animal animal) {

        animalList.put(animal.getName(), animal);
    }

    // 등록 후 등록 정보를 반환해주는 함수
    public Animal getInscriptedAnimal(String animalName) {
        return animalList.get(animalName);
    }


    // 1-2 재접수 하는 동물 함수

    // 아이의 접수 유무 확인하기
    public boolean animalInscriptedCheck(String animalName) {

        if (animalList.containsKey(animalName)) {
            return true;
        }
        return false;
    }

    // 재접수 함수
    public void animalPlusInscription(String animalName) {

        animalWaitingList.add(animalName);

    }




}

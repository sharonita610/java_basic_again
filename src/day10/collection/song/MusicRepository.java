package day10.collection.song;

import day04.array.StringList;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MusicRepository {

    // key : 가수의 이름,  value: 가수 객체
    private static Map<String, Artist> artistList; // 가수 배열

    static {
        artistList = new HashMap<>();
    }

    public static Map<String, Artist> getArtistList() {

        return artistList;
    }

    public static void setArtistList(Map<String, Artist> artistList) {

        MusicRepository.artistList = artistList;
    }

    private StringList songList;

    // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {

        Artist artist = new Artist(artistName, new HashSet<>());
        artist.getSongList().add(songName);
        artistList.put(artist.getName(), artist);
        autoSave();

    }

    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String artistName) {
        return artistList.containsKey(artistName);
    }

    public Artist findArtistbyName(String artistName) {
        return artistList.get(artistName);
    }

    // 기존 가수 객체에 노래를 추가하는 기능

    public boolean inputSong(String artistName, String songName) {
        Artist artist = findArtistbyName(artistName);
        boolean flag = artist.getSongList().add(songName);
        if (flag) autoSave();
        return flag;
    }

    // 특정 가수의 노래목록을 반환하는 기능
    public Set<String> getSongList(String artistName) {
        return findArtistbyName(artistName).getSongList();
    }

    // 등록된 가수의 수 반환
    public int count() {
        return artistList.size();
    }

    // 자동 세이브 기능
    public void autoSave(){

        File f = new File("C:/music");
        if(!f.exists()) f.mkdir();


        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/music/m.sav")
        )){

            oos.writeObject(artistList);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 자동로드
    public static void loadFile(){

        // 세이브 파일이 존재 한다면
        File f = new File("C:/music/m.sav");
        if(f.exists()){
            // 로드해라
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {

                artistList = (Map<String, Artist>) ois.readObject();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

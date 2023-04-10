package day09.musicProgram;

import day04.array.StringList;

import java.io.*;
import java.util.Map;

public class MusicRepository {

    private static Artist[] artistList; // 가수 배열

    static {
        artistList = new Artist[0];
    }

    public static Artist[] getArtistList() {
        return artistList;
    }

    public static void setArtistList(Artist[] artistList) {
        MusicRepository.artistList = artistList;
    }

    private StringList songList;

    // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {

        // 1. 가수 객체 생성
        Artist artist = new Artist();

        // 2. 생성된 가수 객체에 전달받은 이름 셋팅
        artist.setName(artistName);

        // 3. 생성된 가수 객체에 노래 목록 생성해서 셋팅
        artist.setSongList(new StringList());

        // 4. 해당 노래 목록에 전달받은 노래 추가
        artist.getSongList().push(songName);

        // 5. 가수 배열에 해당 가수 객체 추가
        Artist[] temp = new Artist[artistList.length + 1];

        for (int i = 0; i < artistList.length; i++) {
            temp[i] = artistList[i];
        }
        temp[temp.length - 1] = artist;
        artistList = temp;
        // 6. 세이브 파일에 저장
        autoSave();

        // 위에 모든 코드를 이렇게 압축 할 수 있다
//        Artist artist1 = new Artist(artistName, new StringList(songName));
    }

    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String artistName) {

        return findArtistbyName(artistName) != null;
    }

    public Artist findArtistbyName(String artistName) {
        for (Artist artist : artistList) {
            if (artistName.equals(artist.getName())) {
                return artist;
            }
        }
        return null;
    }

    // 기존 가수 객체에 노래를 추가하는 기능
    public boolean inputSong(String artistName, String songName) {
        // 1. 기존 가수 정보를 불러온다
        Artist foundArtist = findArtistbyName(artistName);

        // 2. 그 가수 객체에서 노래목록을 빼온다
        foundArtist.getSongList();
        // 3. 그 노래목록에 새 노래를 추가한다
        if (!songList.includes(songName)) {
            songList.push(songName);
            return true;
        }
        autoSave();
        return false;

    }

    // 특정 가수의 노래목록을 반환하는 기능
    public String[] getSongList(String artistName) {

        return findArtistbyName(artistName).getSongList().getsArr();
    }

    // 등록된 가수의 수 반환
    public int count() {
        return artistList.length;
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



    // 자동 로드 기능



}

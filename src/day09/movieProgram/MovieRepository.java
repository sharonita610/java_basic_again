package day09.movieProgram;


import day04.array.StringList;

public class MovieRepository {

    // 배우는 소속사가 있어야됨. 그래야 어디 소속인지 알 수 있음.
    private static Actor[] ActorsFilm;

    static {
        ActorsFilm = new Actor[0];
    }

    public static Actor[] getActorsFilm() {
        return ActorsFilm;
    }

    public static void setActorsFilm(Actor[] actorsFilm) {
        MovieRepository.ActorsFilm = actorsFilm;
    }

    // ========================= 1 =============================
    // 배열에 영화 목록을 넣을 수 있도록 array list를 대신하는 StringList 를 만들어준다
    private StringList movies;


    // 새로운 배우와 영화를 등록
    public void newActorInscription(String name, String movie) {

        // 새로운 배우를 만든다
        Actor actor = new Actor();

        // 배우에게 이름을 setting 해준다.
        actor.setName(name);

        // 이 배우의 영화 목록을 새로 만들어 준다.
        // 배우의.영화들샛팅하기(새로운 리스트 만들기());
        actor.setMovies(new StringList());

        // 만들어 준 영화 목록에 방금 받아온 영화 이름을 등록해준다.
        actor.getMovies().push(movie);

        // 배우 소속사에 해당 배우 객체를 추가
        Actor[] temp = new Actor[ActorsFilm.length + 1];
        for (int i = 0; i < ActorsFilm.length; i++) {
            temp[i] = ActorsFilm[i];
        }
        temp[temp.length - 1] = actor;
        ActorsFilm = temp;

    }


    // 배우 유무를 체크 했다, 2번에서 만들어 둔거 재활용
    public boolean actorExists(String name) {
        return actorExistanceCheck(name) != null;
    }

    // 배우가 이미 존재하면 영화만 추가 해주면 된다.

    public boolean addMovieToList(String name, String movie) {
        // 1. 기존 배우의 정보를 불러온다

        Actor actor = actorExistanceCheck(name);


        // 2. 그 배우의 객체에서 영화를 빼온다
        actor.getMovies();

        // 3. 그 영화목록에 새 영화를 추가한다
        if (!movies.includes(movie)) {
            movies.push(movie);
            return true;

        }

            return false;
    }

    // ========================= 2 =============================


    // actorExistanceCheck를 사용해서 존재 유무를 먼저 확인애햐됨.
    // 근데 왜 public Actor???
    public Actor actorExistanceCheck(String name) {

        for (Actor actor : ActorsFilm) {
            if (name.equals(actor.getName())) {
                return actor;
            }
        }
        return null;
    }


    // 있다면 활동 영화 목록을 반환하고
    public String[] getMovies(String name) {

        return actorExistanceCheck(name).getMovies().getsArr();

    }


    // 없으면 없다고 알려주면 됨.


    // 리스트에 배우가 몇 명 있는지 확인
    public int countActor() {
        return ActorsFilm.length;
    }

}

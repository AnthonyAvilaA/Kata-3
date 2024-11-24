package software.ulpgc.kata3.kata2;

public class Title {
    private final String id;
    private final TitleType titleType;
    private final String primaryTitle;

    public Title(String id, TitleType titleType, String primaryTitle) {
        this.id = id;
        this.titleType = titleType;
        this.primaryTitle = primaryTitle;
    }

    public String getId() {
        return id;
    }

    public TitleType getTitleType() {
        return titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }


    public enum TitleType {
        VideoGame,
        TvPilot,
        Movie,
        TvSeries,
        TvMiniSeries,
        Short,
        TvSpecial,
        TvShort,
        Video,
        TvMovie,
        TvEpisode
    }

    public enum Genre {
        Action, Adult, Adventure, Animation, Biography, Comedy, Crime, Documentary, Drama, Family, Fantasy, FilmNoir, GameShow, genres, History, Horror, Music, Musical, Mystery, News, RealityTV, Romance, SciFi, Short, Sport, TalkShow, Thriller, War, Western
    }

}
import java.util.Objects;

public class Song {
    private String id;//歌曲id
    private String name;//歌曲名称
    private String singer;//演唱者

    //无参构造方法
    public Song() {

    }

    //构造方法
    public Song(String id,String name,String singer) {
        this.setId(id);
        this.setName(name);
        this.setSinger(singer);
    }

    //getter和setter方法
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(getId(), song.getId()) &&
                Objects.equals(getName(), song.getName()) &&
                Objects.equals(getSinger(), song.getSinger());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSinger());
    }

    @Override
    public String toString() {
        return "歌曲信息  ：id为" + id + ", 歌曲名称：" + name + ", 演唱者： " + singer + "]";
    }
}

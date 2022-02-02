import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayList {
    private String playListName;//播放列表名称
    private List<Song> musicList;//播放列表中的歌曲集合

    //无参构造函数
    public PlayList() {
        musicList=new ArrayList<Song>();//初始化list类型的属性musicList
    }

    //有参构造函数
    public PlayList(String playListName) {
        this.setPlayListName(playListName);
    }
    public PlayList(String playListName,List<Song> musicList) {
        this.setMusicList(musicList);
        this.setPlayListName(playListName);
    }

    //getter和setter方法
    public String getPlayListName() {
        return playListName;
    }
    public void setPlayListName(String playListName) {
        this.playListName = "主播放列表";
    }
    public List<Song> getMusicList() {
        return musicList;
    }
    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }

    //将歌曲添加到播放列表
    public void addToPlayList(Song song) {
        musicList.add(song);

    }

    //显示播放列表中的所有歌曲
    public void displayAllSong() {
        System.out.println("显示播放列表中的所有歌曲");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要显示的播放列表的名称：");
        String playListName=sc.nextLine();
        System.out.println("播放列表中的所有歌曲为：");
        for(Song song:musicList) {
            System.out.println(song);
        }
    }

    //通过id查询歌曲
    public Song searchSongById(String id) {
		/*System.out.println("通过歌曲id查询播放列表中的歌曲 ");
		System.out.println("请输入要查询的播放列表名称：");
		Scanner sc=new Scanner(System.in);
		String playListName=sc.nextLine();
		//判断一下输入的列表名称是否存在
		System.out.println("请输入要查询的歌曲id：");
		id=sc.nextLine();*/
        for(Song song:musicList) {
            if(song.getId().equals(id)) {
                System.out.println("该歌曲信息为：\n"+song);
            }else {
                System.out.println("该歌曲在播放列表喜爱的歌中不存在！");
            }

        }
        return new Song() ;
    }

    //通过名称查询歌曲
    public Song saerchSongByName(String name) {
		/*System.out.println("通过歌曲名称查询播放列表中的歌曲");
		System.out.println("请输入要查询的播放列表名称：");
		Scanner sc=new Scanner(System.in);
		String playListName=sc.nextLine();
		//判断一下输入的列表名称是否存在
		System.out.println("请输入要查询的歌曲名称：");
		name=sc.nextLine();*/
        for(Song song:musicList) {
            if(song.getName().equals(name)) {
                System.out.println("该歌曲信息为：\n"+song);
            }else {
                System.out.println("该歌曲在播放列表喜爱的歌中不存在！");
            }

        }
        return new Song();
    }

    //修改歌曲
    public void updateSong(Song song) {
        System.out.println("修改播放列表中的歌曲");
        System.out.println("请输入要修改的id：");
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        if(song.getId().equals(id)) {
            System.out.println("请输入修改后的歌曲名称：");
            song.setName(sc.nextLine());
            System.out.println("请输入修改后的演唱者：");
            song.setSinger(sc.nextLine());
            musicList.add(song);
            System.out.println("修改成功！");
        }else {
            System.out.println("该歌曲在播放列表喜爱的歌中不存在！");
        }


    }

    //从播放列表中删除歌曲
    public void deleteSong(String id) {
		/*System.out.println("删除播放列表中的歌曲");
		System.out.println("请输入要删除播放歌曲的id：");*/
        for(Song song:musicList) {
            if(song.getId().equals(id)) {
                musicList.remove(song);
                System.out.println("删除成功！");
            }
        }
    }

    //导出歌单
    public void exportPlayList() throws ClassNotFoundException {
        for(Song song:musicList) {
            FileOutputStream fos;
            FileInputStream fis;
            try {
                fos = new FileOutputStream("我的歌单.txt");
                fis=new FileInputStream("我的歌单.txt");
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                ObjectInputStream ois=new ObjectInputStream(fis);
                oos.writeObject(song);
                Song s1=(Song) ois.readObject();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }

        }
    }
}

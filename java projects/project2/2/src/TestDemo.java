import java.util.Scanner;

public class TestDemo {
    /*//测试歌曲类
	public void testSong() {

	}

	//测试播放列表
	public void testPlayList() {

	}

	//测试播放器类
	public void testPlayListCollection() {

	}
	*/
    //主菜单
    public void mainMenu() {
        System.out.println("**********************************************");
        System.out.println("                            主菜单 ");
        System.out.println("       1--播放列表管理                                           ");
        System.out.println("       2--播放器管理                                                ");
        System.out.println("       0--退出                                                            ");
        System.out.println("**********************************************");
        System.out.println("请输入对应数字进行操作：");
    }

    //播放列表管理菜单
    public void playListMenu() {
        System.out.println("**********************************************");
        System.out.println("                               播放列表管理 ");
        System.out.println("       1--将歌曲添加到主播放列表                                   ");
        System.out.println("       2--将歌曲添加到普通播放列表                               ");
        System.out.println("       3--通过歌曲id查询播放列表中的歌曲                  ");
        System.out.println("       4--通过歌曲名称查询播放列表中的歌曲                ");
        System.out.println("       5--修改播放列表中的歌曲                                        ");
        System.out.println("       6--删除播放列表中的歌曲                                        ");
        System.out.println("       7--显示播放列表中的所有歌曲                                ");
        System.out.println("       8--导出歌单                                                                 ");
        System.out.println("       9--返回上一级菜单                                                     ");
        System.out.println("**********************************************");
        System.out.println("请输入对应数字对播放列表进行管理：");
    }

    //播放器菜单
    public void playerMenu() {
        System.out.println("**********************************************");
        System.out.println("                                 播放器管理 ");
        System.out.println("       1--向播放器中添加播放列表                                    ");
        System.out.println("       2--从播放器中删除播放列表                                    ");
        System.out.println("       3--通过名字查询播放列表信息                                ");
        System.out.println("       4--通过歌曲名称查询播放列表中的歌曲                ");
        System.out.println("       5--显示所有播放列表的名称                                      ");
        System.out.println("       9--返回上一级菜单                                                     ");
        System.out.println("**********************************************");
        System.out.println("请输入对应数字对播放器进行管理：");
    }
    public static void main(String[] args) {
		/*
		System.out.println("将歌曲添加到"+pl.getPlayListName());
		pl.addToPlayList(s1);//添加歌曲信息
		plc.addPlayList(pl);
		Scanner sc=new Scanner(System.in);
		plc.searchPlayListByName(sc.nextLine());
		plc.displayPlayListName();
		//添加列表名称以及查询列表名称
		*/
        TestDemo t1=new TestDemo();
        Song s1=new Song();
        PlayList pl1=new PlayList();
        PlayListCollection plc=new PlayListCollection();
        //t1.mainMenu();
        boolean one=true;
        Scanner sc=new Scanner(System.in);
        while(one) {
            t1.mainMenu();
            int n=sc.nextInt();
            switch(n) {
                case 1:boolean two=true;
                    while(two) {
                        t1.playListMenu();
                        int m=sc.nextInt();
                        switch(m) {
                            //添加歌曲到主播放列表
                            case 1:
                                System.out.println("请输入要添加的歌曲数量：");
                                int num=0;
                                num=sc.nextInt();
                                for(int i=0;i<num;i++) {
                                    System.out.println("请输入第"+(i+1)+"首歌曲:");
                                    System.out.println("请输入歌曲的id：");
                                    s1.setId(sc.next());
                                    System.out.println("请输入歌曲的名称：");
                                    s1.setName(sc.next());
                                    System.out.println("请输入演唱者：");
                                    s1.setSinger(sc.next());
                                    pl1.addToPlayList(s1);
                                }
                                System.out.println("添加成功！");
                        }
                    }

            }
        }


    }
}

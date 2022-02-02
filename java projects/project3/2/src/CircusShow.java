import java.util.Scanner;
public class CircusShow {
    public void show() {
        String str = "********欢迎来到太阳马戏团********" + "\n" + "**********  清选择表演者**********" + "\n"
                + "**********    1、棕熊    **********\n**********    2、狮子    **********\n**********    3、猴子    **********\n**********    4、鹦鹉    **********\n**********    5、小丑    **********";
        System.out.println(str);
    }

    // 测试的主方法
    public static void main(String[] args) {
        // 创建测试类对象，用来调用提示的方法
        CircusShow text = new CircusShow();
        // 设定接口类的对象，定义为空值
        IAct iac = null;
        //进入程序后第一次提示信息
        text.show();
        //设定最外层 while循环 ，用x的值控制程序
        boolean x = true;
        while (x) {

            Scanner sc = new Scanner(System.in);
            //从键盘接受数据，从而输出对应的表演者
            int y = sc.nextInt();
            //内层循环一  ，用于控制表演的内容
            boolean m = true;
            while (m) {
                //用if语句控制输入数据必须为1-5
                if (y > 0 & y < 6) {
                    switch (y) {
                        case 1:
                            iac = new Bear("Bill",1);
                            iac.act();
                            iac.skill();
                            break;
                        case 2:
                            iac = new Lion("Lain", 2, "灰色", "公狮");
                            iac.act();
                            iac.skill();
                            break;
                        case 3:
                            iac = new Monkey("Tom", 1,"金丝猴");
                            iac.act();
                            iac.skill();
                            break;
                        case 4:
                            iac = new Parrot("Rose",1,"牡丹鹦鹉");
                            iac.act();
                            iac.skill();
                            break;
                        case 5:
                            iac = new Clown("Kahle",5);
                            iac.act();
                            iac.skill();
                            break;
                    }
                } else {
                    System.out.println("输入信息不正确，请重新输入");
                    text.show();
                    y = sc.nextInt();
                    continue;
                }
                //如果接口类对象实例化，则执行输出语句，并且改变内层循环m的值，结束内层循环一
                if (iac != null) {
                    m = false;
                    System.out.println("******  是否继续观看（1/0）  ******");
                }

            }
            //内层循环二 ，用于控制是否进行表演
            boolean n = true;
            while (n) {

                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        n = false;
                        text.show();
                        break;
                    case 0:
                        System.out.println("欢迎下次光临");
                        System.exit(0);
                    default:
                        System.out.println("输入信息不正确请重新输入");
                }
            }
        }
    }

}


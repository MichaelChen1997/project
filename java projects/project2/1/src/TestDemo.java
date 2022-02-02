import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TestDemo {
    public static void mainMenu() {
        System.out.println("***********************************");
        System.out.println("              **主菜单**");
        System.out.println("              1--商品管理");
        System.out.println("              2--购物车");
        System.out.println("              0--退出");
        System.out.println("***********************************");
    }

    // 商品管理
    public static void goodsManageMenu() {
        System.out.println("***********************************");
        System.out.println("             **商品管理**");
        System.out.println("             1--商品信息导入");
        System.out.println("             2--显示所有商品信息");
        System.out.println("             9--返回上一级菜单");
        System.out.println("***********************************");
    }

    // 购物车管理
    public static void shoppingCartMenu() {
        System.out.println("***********************************");
        System.out.println("             **购物车管理**");
        System.out.println("             1--添加商品到购物车");
        System.out.println("             2--修改购物车中的商品数量");
        System.out.println("             3--显示购物车中的所有商品信息");
        System.out.println("             4--结算");
        System.out.println("             9--返回上一级菜单");
        System.out.println("***********************************");
    }

    // 输入异常检测
    public int myException() {
        Scanner console=new Scanner(System.in);
        int n = 0;
        try {
            n=console.nextInt();
        }catch(InputMismatchException e){
            System.out.println("请输入数字！");
        }catch(Exception e) {
            System.out.println("未知错误");
            e.printStackTrace();
            return -1;
        }
        return n;
    }

    public static void main(String[] args) {

        TestDemo a = new TestDemo();
        GoodsManage gm = new GoodsManage();
        ShoppingCart shop=new ShoppingCart();
        boolean flag=true;
        int n=0;

        // 向商品库中添加商品信息
        // 商品信息
        Goods goods1 = new Goods("g001", "水杯", 56, "Android手机");
        Goods goods2 = new Goods("g002", "饮水机", 299, "带净化功能的饮水机");
        Goods goods3 = new Goods("g003", "笔记本电脑", 4999, "15寸笔记本电脑");
        Goods goods4 = new Goods("g004", "手机", 2300, "不锈钢水杯");

        while(flag) {
            a.mainMenu();
            System.out.println("请输入对应的数字进行操作：");
            n=a.myException();
            flag=true;
            if(n<0||n>2) {
                System.out.println("您输入的有误，请重新输入！");
                continue;
            }else {
                switch(n) {
                    case 1:
                        while(flag) {
                            a.goodsManageMenu();
                            System.out.println("请输入对应的数字进行操作：");
                            n=a.myException();
                            if(n<1||n>2&&n!=9) {
                                System.out.println("您输入的有误，请重新输入！");
                                continue;
                            }
                            switch(n) {
                                case 1:
                                    List<Goods> list = new ArrayList<Goods>();
                                    list.add(goods1);
                                    list.add(goods2);
                                    list.add(goods3);
                                    list.add(goods4);
                                    gm.importGoods(list);
                                    break;
                                case 2:
                                    gm.displayAllGoods();
                                    break;
                                default:
                            }
                            if(n==9) {
                                break;
                            }
                        }
                        break;
                    case 2:
                        while(flag) {
                            a.shoppingCartMenu();
                            System.out.println("请输入对应的数字进行操作：");
                            n=a.myException();
                            if(n<1||n>4&&n!=9) {
                                System.out.println("您输入的有误，请重新输入！");
                                continue;
                            }else {
                                switch(n) {
                                    case 1:
                                        shop.addGoodsToCart(gm);
                                        break;
                                    case 2:
                                        shop.updateNumInCart();
                                        break;
                                    case 3:
                                        shop.displayAllInCart();
                                        break;
                                    case 4:
                                        shop.settleAccounts();
                                        break;
                                }
                            }
                            if(n==9) {
                                break;
                            }
                        }
                        break;
                    case 0:
                        System.out.println("****欢迎您下次光临****");
                        return;
                    default:
                }
            }
        }


    }
}

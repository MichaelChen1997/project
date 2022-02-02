import java.util.*;

public class ShoppingCart {
    private Map<String, GoodsInCart> shoppingCart;// 购物车

    // 构造方法
    public ShoppingCart() {
        shoppingCart = new HashMap<String, GoodsInCart>();
    }

    public ShoppingCart(Map<String, GoodsInCart> shoppinCart) {
        this();
        this.setShoppingCart(shoppinCart);
    }

    // getter和setter方法
    public Map<String, GoodsInCart> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<String, GoodsInCart> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    // 添加商品到购物车
    public void addGoodsToCart(GoodsManage gm) {
        if (gm.getGoodsSet().isEmpty()) {
            System.out.println("请先导入商品：");
        } else {
            gm.displayAllGoods();
            // 商品编号
            String str = null;
            // 商品数量
            int num;
            Goods goods = null;
            while (true) {
                Scanner console1 = new Scanner(System.in);
                System.out.println("请输入商品编号：");
                str = console1.next();
                boolean flag = false;
                Iterator<Goods> it = gm.getGoodsSet().iterator();
                while (it.hasNext()) {
                    goods = it.next();
                    while (str.equals(goods.getGoodsId())) {
                        Scanner console2 = new Scanner(System.in);
                        System.out.println("请输入商品数量：");
                        if (console2.hasNextInt()) {
                            num = console2.nextInt();
                            if (num > 0) {
                                // 购物车中已存在输入的商品，修改购物车中已存在商品数量
                                for (String key : getShoppingCart().keySet()) {
                                    if(getShoppingCart().get(key).equals(goods)){
                                        int exist = getShoppingCart().get(key).getNum();
                                        getShoppingCart().get(key).setNum(exist + num);
                                        System.out.println("已加入购物车");
                                        flag = true;
                                        break;
                                    }
                                }
                                if (!flag) {
                                    // 如果购物车没有，就加入购物车
                                    GoodsInCart gic = new GoodsInCart(goods, num);
                                    shoppingCart.put(str, gic);
                                    System.out.println("已加入购物车");
                                    flag = true;
                                    break;
                                }
                            } else {
                                System.out.println("商品数量必须大于0");
                            }
                            if (flag) {
                                break;
                            }
                        } else {
                            System.out.println("你输入的不是数字，请重新输入：");
                            continue;
                        }
                        if (flag) {
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
    }
    public void updateNumInCart() {
        if (getShoppingCart().isEmpty()) {
            System.out.println("购物车是空的呦，赶快装满吧~");
        } else {
            int n = 0;
            boolean flag = true;
            String str;
            // 重新输入商品编号开关

                Scanner console3 = new Scanner(System.in);
                System.out.println("请输入要修改的商品编号：");
                str = console3.next();
                // 重新输入商品数量开关
                while (flag) {
                    for (String key : getShoppingCart().keySet()) {
                        if (str.equals(key)) {
                            System.out.println("请输入要修改的商品数量：");
                            try {
                                Scanner console4 = new Scanner(System.in);
                                n = console4.nextInt();
                                n = (n >= 0) ? n : 0;
                                if (n == getShoppingCart().get(str).getNum()) {
                                    System.out.println("你没有修改商品数量");
                                    return;
                                }
                                if (n == 0) {
                                    getShoppingCart().remove(str);
                                    System.out.println("该商品已移除！");
                                    return;
                                } else {
                                    getShoppingCart().get(str).setNum(n);
                                    System.out.println("该商品数量已修改！");
                                    return;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("请输入数字");
                                flag = false;

                            } catch (Exception e) {
                                System.out.println("未知类型错误！");
                                e.printStackTrace();
                                flag = false;

                            }
                        }
                        System.out.println("输入编码不存在");
                        break;
                    }
                }
            }

    }
    public void displayAllInCart() {
        if(getShoppingCart().isEmpty()) {
            System.out.println("购物车是空的哟，赶快装满吧~");
        }else {
            for(String key:getShoppingCart().keySet()) {
                System.out.println("商品编号："+key+", 商品名称："+getShoppingCart().get(key).getGoods().getGoodsName()
                        +", 商品价格："+getShoppingCart().get(key).getGoods().getPrice()+", 商品描述："
                        +getShoppingCart().get(key).getGoods().getGoodsDesp()+", 商品数量："+getShoppingCart().get(key).getNum());
            }
        }
    }

    // 结算
    public void settleAccounts() {
        double totalPrices=0;
        if(getShoppingCart().isEmpty()) {
            System.out.println("购物车内是空的，不能结算");
            return;
        }
        Iterator<Map.Entry<String,GoodsInCart>> it=getShoppingCart().entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, GoodsInCart> entry=it.next();
            double Prices=entry.getValue().getNum()*entry.getValue().getGoods().getPrice();
            totalPrices+=Prices;
        }
        System.out.println("商品总价格为："+totalPrices+"元");
    }

}

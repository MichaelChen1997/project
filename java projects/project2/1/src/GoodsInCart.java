public class GoodsInCart {
    private Goods goods;// 商品信息
    private int num;// 商品数量

    // 构造方法
    public GoodsInCart(Goods goods, int num) {
        this.goods = goods;
        this.num = num;
    }

    // getter和setter方法
    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

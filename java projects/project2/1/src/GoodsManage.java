import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class GoodsManage {
    private Set<Goods> goodsSet;
    public GoodsManage() {
        goodsSet = new HashSet<Goods>();
    }

    public GoodsManage(Set<Goods> goodsSet) {
        this();// 调用本类中另一种形式的构造函数（应该为构造函数中的第一条语句）
        this.setGoodsSet(goodsSet);
    }

    // getter和setter方法
    public Set<Goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<Goods> goodsSet) {
        this.goodsSet = goodsSet;
    }

    // 商品信息导入
    public void importGoods(List<Goods> goods) {
        goodsSet.addAll(goods);
        System.out.println("商品信息导入");
        System.out.println("导入成功！");

    }

    // 显示所有商品信息
    // 迭代器遍历
    public void displayAllGoods() {
        Iterator<Goods> it = getGoodsSet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        if (getGoodsSet().isEmpty()) {
            System.out.println("商品信息为空，请先导入商品！");
        }
    }
}

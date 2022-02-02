public class Clown implements  IAct{
    private String name;
    private int years;
    public Clown() {

    }

    public Clown(String name, int years) {
        this.setName(name);
        this.setYears(years);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void dress(){
        System.out.println("着装：身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆");
    }


    @Override
    public void act() {
        System.out.println("表演者: "+this.name);

        System.out.println("艺龄: "+this.years);
    }

    @Override
    public void skill() {
        System.out.println("技能：脚踩高跷魔术表演");
    }
}

public class Monkey extends Animal implements  IAct {
    private String species;

    public  Monkey(){

    }

    public Monkey(String name, int age, String species) {
        super(name,age);
        this.setSpecies(species);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    @Override
    public void love(){
        System.out.println("爱好：喜欢模仿人的动作");
    }

    @Override
    public void act() {
        System.out.println("表演者: "+super.getName());

        System.out.println("年龄: "+super.getAge());

        System.out.println("品种: "+this.species);
    }

    @Override
    public void skill() {
        System.out.println("技能：骑独轮车过独木桥");
    }
}

public class Parrot extends Animal implements  IAct {
    private String species;
    public Parrot() {
    }

    public Parrot(String name, int age, String species) {
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
        System.out.println("爱好：喜欢吃坚果和松子");
    }

    @Override
    public void act() {
        System.out.println("表演者: "+super.getName());

        System.out.println("年龄: "+super.getAge());

        System.out.println("品种: "+this.species);
    }

    @Override
    public void skill() {
        System.out.println("技能：擅长模仿");
    }
}

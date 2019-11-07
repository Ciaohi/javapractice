package cn.jmjy.day12.test7;

/**
 * @author Ciaohi
 * @date 2019/11/5 上午11:55
 */
public class Dog extends Pet {
    public void wan(){
        System.out.println("小狗汪汪汪");
    }
    @Override
    public int getAccompany() {
        if (health<50){
            accompany+=80;
            System.out.println(name+"得到主人的陪伴...");
        }
        return accompany;
    }


    private int loyalty;//狗的忠诚度

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public Dog(){
        this(1001,"牧羊犬");//调用有参构造器,只能写在第一行
    }
    public Dog(long id, String name){
        this.id=id;
        this.name=name;
    }
    //id，masterId，name，grade（等级），健康值,亲密度....


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMasterId() {
        return masterId;
    }

    public void setMasterId(long masterId) {
        this.masterId = masterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setAge(int age) {
        this.age = age;
    }


    //作战（Fight）
    public void fight(String name) {
        System.out.println(this.name+"与"+name+"打架");
    }
    //信息输出
    public void printPetInfo() {
        System.out.println("我是"+this.name );
    }


}

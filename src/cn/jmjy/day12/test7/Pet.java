package cn.jmjy.day12.test7;

/**
 * @author Ciaohi
 * @date 2019/11/6 上午11:26
 */
public  abstract class Pet {
    public abstract int getAccompany();
    protected long id;// 宠物id
    protected long masterId;// 宠物主人id
    protected String name;// 宠物名字
    protected int age;// 宠物的年龄
    protected int health;// 宠物的健康值
    protected int accompany;//宠物陪伴值



    public void setAccompany(int accompany) {
        this.accompany = accompany;
    }

    public abstract void printPetInfo();


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

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

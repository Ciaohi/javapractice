package cn.jmjy.day11.test;

/**
 * @author Ciaohi
 * @date 2019/11/6 上午10:33
 */
public class Cat extends Pet {
    private int love;// 猫的亲密值
    public Cat() {
        this(0,0,"");
    }
    public Cat(long id,long masterId,String name) {
        this(id,masterId,name,100,0);
    }


    public Cat(long id, long masterId, String name, int health, int love) {
        this.id=id;
        this.masterId=masterId;
        this.name="波斯猫";
        this.health=health;
        this.love=love;
    }
    public void printPetInfo() {
        System.out.println("宠物的自白：\n我的名字叫" + this.name + "，我的健康值是"+this.health+
                ",我和主人的亲密度是"+love);
    }
}

package cn.jmjy.day12.test7;

/**
 * @author Ciaohi
 * @date 2019/11/7 上午10:47
 */
public class Master {

    public void accompanyPet(Pet pet) {
        pet.getAccompany();
    }
    public void palyWith(Pet pet){
        //小狗 汪汪
        if(pet instanceof Dog){
            Dog dog=(Dog) pet;
            dog.wan();
        }
        //小猫 喵喵
        else if(pet instanceof Cat){
            Cat cat=(Cat)pet;
            cat.miao();
        }
    }

    /*public void accompanyPet(Cat cat) {
        cat.getAccompany();
    }
    public void accompanyPet(Dog dog) {
        dog.getAccompany();
    }*/


    private int id;
    private String name;

    public Master() {
    }

    public Master(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






}

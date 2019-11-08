package cn.jmjy.day13.test10;

/**
 * @author Ciaohi
 * @date 2019/11/8 下午1:59
 */
public class Client {
    public static void main(String[] args) {
        UseAge u=new UseAge();
        u.useAge(age->age*3,5);

      /*  u.useAge(new AgeInterFace() {
            @Override
            public int getAge(int age) {
                return 3 * age;
            }
        }, 5);*/
    }
}

package cn.jmjy.day13.test11;

/**
 * @author Ciaohi
 * @date 2019/11/8 下午2:30
 */
public class Client {
    public static void main(String[] args) {
        UseAge u=new UseAge();
        u.useAge(new AgeInterFace() {
            @Override
            public int getAge(int oldAge, int newAge) {
                return newAge-oldAge;
            }
        }, 8, 18);

        u.useAge((x,y)->y-x,8,18);
    }
}

package cn.jmjy.day13.test9;

/**
 * @author Ciaohi
 * @date 2019/11/8 下午1:45
 */
public class Client {
    public static void main(String[] args) {
        UseAge u=new UseAge();
        u.useAge(()->8);
       /* u.useAge(new AgeInterFace() {
         @Override
         public int getAge() {
         return 8;
         }
       });*/

    }
}

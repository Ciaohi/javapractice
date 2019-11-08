package cn.jmjy.day13.test11;

/**
 * @author Ciaohi
 * @date 2019/11/8 下午2:30
 */
public class UseAge {
    public void useAge(AgeInterFace ageInterFace,int oldAge,int newAge) {
        System.out.println(ageInterFace.getAge(oldAge,newAge));
    }
}

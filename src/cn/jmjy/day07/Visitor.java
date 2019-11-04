package cn.jmjy.day07;

/**
 * @author Ciaohi
 * @date 2019/11/1 下午2:22
 */
public class Visitor {
    public String name; //姓名
    public int age; //年龄
    //显示信息方法
    public void show(){
        if(age>=18 && age<=60){ //判断年龄
            System.out.println(name+"年龄为"+age+",价格为15元" );
        }else{
            System.out.println(name + "的年龄为："+age+"，免费");
        }
    }
}



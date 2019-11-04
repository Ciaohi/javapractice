package cn.jmjy.day07;

/**
 * @author Ciaohi
 * @date 2019/11/1 下午3:15
 */
public class StudentsBiz {
    String[] names = new String[30];
    // 增加学生姓名
    public void addName(String name) {
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                index = i;
                break;
            }
        }
        names[index] = name;
    }
    // 显示全部学生姓名
    public void showNames() {
        System.out.print("学生姓名：");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.print(names[i] + " ");
            }
        }
    }
}

package cn.jmjy.day07;

/**
 * @author Ciaohi
 * @date 2019/11/1 下午12:01
 * 总经理
 */
public class President extends Emp{
    /**
     * 审核报销：auditAndReimbursement
     */
    public void auditAndReimbursement(String name) {
        System.out.println(this.name+"审核报销");
        System.out.println(name+"的报销审核通过");
    }
}

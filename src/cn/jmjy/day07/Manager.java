package cn.jmjy.day07;

/**
 *主管
 */
public class Manager extends Emp{
    /**
     * 审核报销：auditAndReimbursement
     */
    public void auditAndReimbursement(String name) {
        System.out.println(this.name+"审核报销");
        System.out.println(name+"的报销审核通过");
    }
}

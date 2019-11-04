package cn.jmjy.day07;


/**
 * 财务
 */
public class Accounter extends Emp {
    /**
     * 审核报销：auditAndReimbursement
     */
    public void auditAndReimbursement(String name) {
        System.out.println(this.name+"审核报销");
        System.out.println(name+"的报销审核通过");
    }

    public void sendAndReimbursement(String name) {
        System.out.println(this.name+"给："+name+"发放报销");
    }
}

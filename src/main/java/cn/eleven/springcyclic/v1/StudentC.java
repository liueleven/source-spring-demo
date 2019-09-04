package cn.eleven.springcyclic.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-26 14:14
 * @author: 十一
 */
public class StudentC {

    private StudentA studentA;

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }

    public StudentC() {
    }

    public StudentA getStudentA() {
        return studentA;
    }

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }
}

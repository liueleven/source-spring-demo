package cn.eleven.springcyclic.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-26 14:14
 * @author: 十一
 */
public class StudentB {
    private StudentC studentC;

    public StudentB(StudentC studentC) {
        this.studentC = studentC;
    }

    public StudentB() {
    }

    public StudentC getStudentC() {
        return studentC;
    }

    public void setStudentC(StudentC studentC) {
        this.studentC = studentC;
    }
    
}

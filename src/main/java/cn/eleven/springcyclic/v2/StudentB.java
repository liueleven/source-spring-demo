package cn.eleven.springcyclic.v2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-26 14:14
 * @author: 十一
 */
@Component
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

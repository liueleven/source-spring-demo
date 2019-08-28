package cn.eleven.springcyclic.v2;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-26 14:14
 * @author: 十一
 */
public class StudentA {

    private StudentB studentB;

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }

    public StudentA() {
    }

    public StudentB getStudentB() {
        return studentB;
    }

    public void setStudentB(StudentB studentB) {
        this.studentB = studentB;
    }
}

package cn.eleven.springcyclic.v2;

import cn.eleven.springcyclic.v1.StudentA;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-26 14:14
 * @author: 十一
 */
public class StudentC {


    private StudentA studentA;


    public StudentC() {
    }

    public StudentA getStudentA() {
        return studentA;
    }

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }
}

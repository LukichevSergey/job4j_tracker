package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sergey");
        student.setGroup(1);
        student.setDate(LocalDate.now());

        System.out.println("Студент - " + student.getName() + ". Группа - " + student.getGroup() + " Дата поступления - " + student.getDate());
    }
}

package com.mami.luv2codes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {


    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        TennisCoach tennisCoach1 = context.getBean("tennisCoach", TennisCoach.class);
        TennisCoach tennisCoach2 = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(tennisCoach1 == tennisCoach2);


    }
}
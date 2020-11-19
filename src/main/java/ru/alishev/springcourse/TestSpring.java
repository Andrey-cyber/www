package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;






    /**
     * @author Neil Alishev
     */
    public class TestSpring {
        public static void main(String[] args) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml"
            );

            Object music = context.getBean("musicBean" ,Object.class);


            MusicPlayer musicPlayer = new MusicPlayer();

            musicPlayer.playMusic();

            context.close();
        }
    }



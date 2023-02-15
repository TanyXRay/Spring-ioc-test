package ru.home.chernyadieva.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.home.chernyadieva.music.player.MusicPlayer;

public class TestSpring {

    public static void main(String[] args) {
        /*
        из данного контекста Spring из файла конфигурации создает указанные в нем бины
         (создание объектов в Spring Context Application)
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);//DI с помощью settera
        System.out.println(musicPlayer.playMusic());

        context.close();//закрываем контекст
    }
}

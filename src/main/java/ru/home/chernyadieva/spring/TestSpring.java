package ru.home.chernyadieva.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.home.chernyadieva.music.interface_music.Music;
import ru.home.chernyadieva.music.player.MusicPlayer;

public class TestSpring {

    public static void main(String[] args) {
        /*
        из данного контекста Spring из файла конфигурации создает указанные в нем бины
         (создание объектов в Spring Context Application)
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicClassicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);// IoC (внедрение зависимостей через конструктор)
        System.out.println(musicPlayer.playMusic());

        Music music2 = context.getBean("musicRockBean", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);// IoC (внедрение зависимостей через конструктор)
        System.out.println(musicPlayer2.playMusic());

        context.close();//закрываем контекст
    }
}

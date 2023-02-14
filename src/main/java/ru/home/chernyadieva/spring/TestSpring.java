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

        //Music music = context.getBean("musicClassicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);// IoC (внедрение зависимостей через конструктор)

        /*
        теперь делаем DI с помощью Spring через конфигурационный файл, ранее создавали bean вручную(см.комментарии выше)
         */
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());

        context.close();//закрываем контекст
    }
}

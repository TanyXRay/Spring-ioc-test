package ru.home.chernyadieva.music;

import ru.home.chernyadieva.music.interface_music.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock: Boulevard of broken dreams";
    }
}

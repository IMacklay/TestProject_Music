package com.example.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class MusicPlayer {

    private List<Music> musicList;

    private String name;

    private int Volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){

        Random random = new Random();

        //Выбор жанра
        int numGenre = random.nextInt(MusicGenre.values().length);
        MusicGenre choiceMusicGenre = MusicGenre.values()[numGenre];

        Map<MusicGenre,List<String>> choiceGenreMap = new HashMap<>();

        for (Music list: musicList) {
            if (list.getMusicGenre() == choiceMusicGenre) {
                choiceGenreMap = list.getSongs();
                break;
            }
        }


        //Выбор песни
        int numSong = random.nextInt(choiceGenreMap.values().size());
        System.out.println(choiceGenreMap);
        String choiceMusic = choiceGenreMap.get(choiceMusicGenre).get(numSong);

        System.out.println("Now playing: ("+choiceMusicGenre+"): " + choiceMusic);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return Volume;
    }
}

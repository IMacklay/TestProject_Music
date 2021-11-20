package com.example.music;

import java.util.*;

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

        //Забираем из Листа эл-т который подходит по жанру
        //С помощью перебора musicList
//        Map<MusicGenre,List<String>> choiceGenreMap = new HashMap<>();
//        for (Music pickMusic: musicList) {
//            if (pickMusic.getMusicGenre() == choiceMusicGenre) {
//                choiceGenreMap = pickMusic.getSongs();
//                break;
//            }
//        };

        //Забираем из Листа эл-т который подходит по жанру
        //C использованием Stream
        Map<MusicGenre,List<String>> choiceGenreMap = musicList.stream()
                .filter(value -> value.getMusicGenre() == choiceMusicGenre )
                .findFirst()
                .orElseThrow()
                .getSongs()
                ;

        //Выбор песни
        int numSong = random.nextInt(choiceGenreMap.get(choiceMusicGenre).toArray().length);
        String choiceMusic = choiceGenreMap.get(choiceMusicGenre).get(numSong);

        //Выводим результат
        System.out.println("Choiced genre: "+choiceMusicGenre+"\n" +
                           "Number choiced song: "+numSong);
        System.out.println("Now playing: " + choiceMusic);

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

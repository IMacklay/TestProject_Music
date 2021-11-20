package com.example.music;

import org.springframework.stereotype.Component;

import java.util.*;

public class RockMusic implements Music{

    private final MusicGenre musicGenre = MusicGenre.ROCK;
    private List<String> listOfSongs = new ArrayList<>();

    public Map<MusicGenre,List<String>> getSongs() {
        return fillRockMap();
    }

    private Map<MusicGenre,List<String>> fillRockMap(){

        listOfSongs.add("AC/DC - Highway to Hell");
        listOfSongs.add("VanHallen - Aint Talkin boat love");
        listOfSongs.add("KINO - PEREMEN");

        Map<MusicGenre,List<String>> rockMap = new HashMap<>();

        rockMap.put(musicGenre, listOfSongs);

        return rockMap;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }
}

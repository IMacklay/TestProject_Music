package com.example.music;

import org.springframework.stereotype.Component;

import java.util.*;

public class RockMusic implements Music{

    public final MusicGenre musicGenre = MusicGenre.ROCK;

    public Map<MusicGenre,List<String>> getSongs() {
        Map<MusicGenre,List<String>> rockMap = fillRockMap();
        return rockMap;
    }

    private Map<MusicGenre,List<String>> fillRockMap(){

        List<String> listOfSongs = new ArrayList<>();
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

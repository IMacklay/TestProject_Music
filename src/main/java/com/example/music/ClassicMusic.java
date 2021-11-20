package com.example.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ClassicMusic implements Music{

    public final MusicGenre musicGenre = MusicGenre.CLASSIC;

    @Override
    public Map<MusicGenre,List<String>> getSongs() {
        Map<MusicGenre,List<String>> classicMap = fillClassicMap();
        return classicMap;
    }

    private Map<MusicGenre,List<String>> fillClassicMap(){

        Map<MusicGenre,List<String>> classicMap = new HashMap<>();


        List<String> listOfSongs = new ArrayList<>();

        listOfSongs.add("Mazart - Winter");
        listOfSongs.add("Enio Morricone - Proffesional");
        listOfSongs.add("Vivaldi - Times of Year");

        classicMap.put(musicGenre, listOfSongs);

        return classicMap;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }
}

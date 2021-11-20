package com.example.music;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ClassicMusic implements Music{

    private final MusicGenre musicGenre = MusicGenre.CLASSIC;

    private List<String> listOfSongs = new ArrayList<>();

    @Override
    public Map<MusicGenre,List<String>> getSongs() {
        return fillClassicMap();
    }

    private Map<MusicGenre,List<String>> fillClassicMap(){

        Map<MusicGenre,List<String>> classicMap = new HashMap<>();

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

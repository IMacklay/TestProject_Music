package com.example.music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class POPMusic implements Music{

    private final MusicGenre musicGenre = MusicGenre.POP;
    private List<String> listOfSongs = new ArrayList<>();

    public Map<MusicGenre,List<String>> getSongs() {
        return fillPOPMap();
    }

    private Map<MusicGenre,List<String>> fillPOPMap(){

        listOfSongs.add("Britney - Toxic");
        listOfSongs.add("Bilan - About white rozes");
        listOfSongs.add("VIA GRA - LLM");

        Map<MusicGenre,List<String>> popMap = new HashMap<>();

        popMap.put(musicGenre, listOfSongs);

        return popMap;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }
}

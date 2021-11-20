package com.example.music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class POPMusic implements Music{

    public final MusicGenre musicGenre = MusicGenre.POP;

    public Map<MusicGenre,List<String>> getSongs() {
        Map<MusicGenre,List<String>> popMap = fillPOPMap();
        return popMap;
    }

    private Map<MusicGenre,List<String>> fillPOPMap(){

        List<String> listOfSongs = new ArrayList<>();
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

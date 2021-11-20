package com.example.music;

import java.util.List;
import java.util.Map;

public interface Music {
    public Map<MusicGenre,List<String>> getSongs();
    public MusicGenre getMusicGenre();
}

package com.example.music;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("com.example.music")
@PropertySource("classpath:MusicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicMusic classicalMusicBean(){
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusicBean(){
        return new RockMusic();
    }

    @Bean
    public POPMusic popMusicBean(){
        return new POPMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(rockMusicBean(), popMusicBean(), classicalMusicBean());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

}

package io.callable.sdk.dto.verbs;

import io.callable.sdk.enums.GoogleTTSLanguage;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class CallableSay {
    private List<String> text;
    private Integer loop;
    private GoogleTTSLanguage voice;

    public CallableSay(List<String> text, Integer loop, GoogleTTSLanguage voice) {
        this.text = text;
        this.loop = loop;
        this.voice = voice;
    }

    public CallableSay(List<String> text, Integer loop) {
        this.text = text;
        this.loop = loop;
        this.voice = GoogleTTSLanguage.English_UK_Standard_A_Female;
    }

    public CallableSay(String text, Integer loop) {
        this.text = Arrays.asList(text);
        this.loop = loop;
        this.voice = GoogleTTSLanguage.English_UK_Standard_A_Female;
    }
}

package com.candidbot.service;

import javax.speech.*;      
import java.util.*;      
import javax.speech.synthesis.*;

import org.springframework.stereotype.Component;

@Component
public class TextToSpeech {      
    String speaktext;   
    public void dospeak(String speak, String voicename) {
    	System.setProperty("javax.speech.synthesis.BaseSynthesizer", "com.microsoft.speech.synthesis.Synthesizer");
        speaktext = speak;      
        String voiceName = voicename;      
        try {      
            SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general",  Locale.US, null, null);      
            Synthesizer synthesizer =  Central.createSynthesizer(desc);      
            synthesizer.allocate();      
            synthesizer.resume();       
            desc = (SynthesizerModeDesc)  synthesizer.getEngineModeDesc();       
            Voice[] voices = desc.getVoices();        
            Voice voice = null;   
            for (int i = 0; i < voices.length; i++) {      
                if (voices[i].getName().equals(voiceName)) {      
                    voice = voices[i];      
                    break;       
                }       
            }      
            synthesizer.getSynthesizerProperties().setVoice(voice);      
            synthesizer.speakPlainText(speaktext, null);
        } catch (Exception e) {      
            String message = " missing speech.properties in " + System.getProperty("user.home") + "\n";      
            System.out.println("" + e);      
            System.out.println(message);      
        }      
    }  
}

package com.speech.card.reader.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vosk.LibVosk;
import org.vosk.LogLevel;
import org.vosk.Model;
import org.vosk.Recognizer;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class VoskService {

    public void speechReader() throws IOException {
        LibVosk.setLogLevel(LogLevel.DEBUG);

        AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 60000, 16, 2, 4, 44100, false);
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
        TargetDataLine microphone;
        SourceDataLine speakers;

        try (Model model = new Model("src/main/resources/models/en");
             Recognizer recognizer = new Recognizer(model, 120000)) {
            try {

                microphone = (TargetDataLine) AudioSystem.getLine(info);
                microphone.open(format);
                microphone.start();

                ByteArrayOutputStream out = new ByteArrayOutputStream();
                int numBytesRead;
                int CHUNK_SIZE = 1024;
                int bytesRead = 0;

                DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, format);
                speakers = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
                speakers.open(format);
                speakers.start();
                byte[] b = new byte[4096];

                while (bytesRead <= 100000000) {
                    numBytesRead = microphone.read(b, 0, CHUNK_SIZE);
                    bytesRead += numBytesRead;

                    out.write(b, 0, numBytesRead);

                    speakers.write(b, 0, numBytesRead);

                    if (recognizer.acceptWaveForm(b, numBytesRead)) {
                        System.out.println("Test Result -> " + recognizer.getResult());
                    } else {
                        System.out.println("Test Partial -> " + recognizer.getPartialResult());
                    }
                }
                System.out.println("Test Final -> " + recognizer.getFinalResult());
                speakers.drain();
                speakers.close();
                microphone.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

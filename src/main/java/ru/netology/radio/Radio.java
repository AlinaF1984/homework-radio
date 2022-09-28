package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {

    private int maxRadioStationNumber;
    private int minRadioStationNumber;

    private int currentRadioStationNumber;

    private int maxSoundVolume;
    private int minSoundVolume;

    private int soundVolume = minSoundVolume;

}
package edu.number.baseball.randomnumber;

import java.util.List;

public interface RandomNumberGenerationRule {
    List<Integer> create(int size);
}

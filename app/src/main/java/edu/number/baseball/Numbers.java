package edu.number.baseball;

public interface Numbers {
    // AGJ : need to check Java version is over 9
    default boolean equals(Numbers A, Numbers B){
        return A.toString().equals(B.toString());
    }
}

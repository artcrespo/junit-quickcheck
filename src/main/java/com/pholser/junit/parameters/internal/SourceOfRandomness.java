package com.pholser.junit.parameters.internal;

public interface SourceOfRandomness {
    int nextInt();

    int nextInt(int min, int max);
}

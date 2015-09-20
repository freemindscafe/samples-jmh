package com.freemindcafe.jmh.sample4;

import java.util.concurrent.atomic.LongAdder;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.GroupThreads;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Group)
public class LongAdderCounterBenchmark11 {
    private LongAdder counter;
    @Setup
    public void up() {
        counter = new LongAdder();
    }

    @Benchmark
    @Group("rw")
    @GroupThreads(11)
    public void inc() {
        counter.increment();
    }

    @Benchmark
    @Group("rw")
    public long get() {
        return counter.sum();
    }
}

package com.freemindcafe.jmh.sample4;

import java.util.concurrent.atomic.AtomicLong;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.GroupThreads;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Group)
public class AtomicCounterBenchmark {
    private AtomicLong counter;
    @Setup
    public void up() {
        counter = new AtomicLong();
    }

    @Benchmark
    @Group("rw")
    @GroupThreads(1)
    public void inc() {
        counter.incrementAndGet();
    }

    @Benchmark
    @Group("rw")
    public long get() {
        return counter.get();
    }
}

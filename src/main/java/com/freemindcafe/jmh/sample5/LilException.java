package com.freemindcafe.jmh.sample5;

public class LilException extends Exception {
    private final int metadata;

    public LilException(int metadata) {
        super();
        this.metadata = metadata;
    }

    public LilException(LilException e, int metadata) {
        super(e);
        this.metadata = metadata;
    }

    public int getMetadata() {
        return metadata;
    }
}
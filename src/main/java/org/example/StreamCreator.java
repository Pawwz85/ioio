package org.example;

public class StreamCreator extends ProductCreator{
    @Override
    public Product createProduct() {
        return new Streaming();
    }
}

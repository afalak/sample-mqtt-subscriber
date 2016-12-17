package com.github.mqtt.subscriber;

public interface MessageListener {
    void messageReceived(String message);
}

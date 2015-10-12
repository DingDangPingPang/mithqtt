package com.github.longkerdandy.mithril.mqtt.api.comm;

import java.util.List;

/**
 * Represent MQTT UNSUBSCRIBE Message's VariableHeader and Payload
 */
public class CommunicatorUnsubscribePayload {

    private int packetId;
    private List<String> topics;

    public int getPacketId() {
        return packetId;
    }

    public void setPacketId(int packetId) {
        this.packetId = packetId;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }
}

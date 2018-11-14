package com.chen.mqtt.config;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

/**
 * @author cds
 * @create 2018-11-14 13:41
 * @description
 */
@Component
@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MsgWriter {
    void senToMqtt(String data);

    void sendToMqtt(String payload, @Header(MqttHeaders.TOPIC) String topic);

    void sendToMqtt(@Header(MqttHeaders.TOPIC) String topic, @Header(MqttHeaders.QOS) int qos, String payload);
}

package org.emsg.kafka_sdk.handler;

public interface MessageHandler<T> {
	public void dealMessage(String topic, T t);
}

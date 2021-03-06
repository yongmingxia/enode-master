package com.qianzhui.enode.rocketmq;

/**
 * Created by junbo_xu on 2016/3/9.
 */
public enum RocketMQMessageTypeCode {
    Other(0), //为保持与C#版本一致
    CommandMessage(1),
    DomainEventStreamMessage(2),
    ExceptionMessage(3),
    ApplicationMessage(4);

    int value;

    RocketMQMessageTypeCode(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}

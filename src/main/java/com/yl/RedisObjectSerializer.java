package com.yl;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.lang.Nullable;

/**
 * @author 杨黎
 * @Title
 * @description
 * @DATE 2018/11/15  13:49
 */
public class RedisObjectSerializer implements RedisSerializer<Object>{

    private Converter<Object,byte[]> serializer = new SerializingConverter();

    private Converter<byte[],Object> deSerializer = new DeserializingConverter();

    static final byte[] EMPTY_ARRAY = new byte[0];

    @Override
    public byte[] serialize(@Nullable Object object) {
        if (object == null) {
            return EMPTY_ARRAY;
        }

        try {
            return serializer.convert(object);
        } catch (Exception ex) {
            return EMPTY_ARRAY;
        }
    }

    @Override
    public Object deserialize(byte[] bytes){
        if(isEmpty(bytes)){
            return null;
        }
        try {
            return deSerializer.convert(bytes);
        } catch (Exception e) {
            throw new SerializationException("can't deSerializer",e);
        }
    }

    public boolean isEmpty(byte[] data){
        return (data == null || data.length == 0);
    }
}

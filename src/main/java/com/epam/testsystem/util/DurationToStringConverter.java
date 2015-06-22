package com.epam.testsystem.util;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.Duration;

@Converter
public class DurationToStringConverter implements AttributeConverter<Duration, String>
{

    @Override
    public String convertToDatabaseColumn(Duration entityValue)
    {
        return entityValue == null ? null : entityValue.toString();
    }

    @Override
    public Duration convertToEntityAttribute(String databaseValue)
    {
        return databaseValue == null ? null : Duration.parse(databaseValue);
    }
}

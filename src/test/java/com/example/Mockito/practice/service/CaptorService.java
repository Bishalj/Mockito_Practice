package com.example.Mockito.practice.service;

import com.example.Mockito.practice.model.StringBuilder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;



public class CaptorService {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Captor
    private ArgumentCaptor<StringBuilder> argumentCaptor;

    @Test
    public void checkCaptorWorkings(){

        StringBuilder text = new StringBuilder("Practice mockito");

        StringBuilder mockStringBuffer = mock(StringBuilder.class);

        mockStringBuffer.append(text);

        verify(mockStringBuffer).append(argumentCaptor.capture());
        Assert.assertEquals(argumentCaptor.getValue().getText(), text.getText());
    }
}

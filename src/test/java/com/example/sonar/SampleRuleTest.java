package com.example.sonar;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test class for SampleRule
 */
class SampleRuleTest {
    
    private final SampleRule sampleRule = new SampleRule();
    
    @Test
    void shouldReturnGreetingWithName() {
        // Given
        String name = "John";
        
        // When
        String result = sampleRule.greet(name);
        
        // Then
        assertThat(result).isEqualTo("Hello, John!");
    }
    
    @Test
    void shouldReturnDefaultGreetingWhenNameIsNull() {
        // Given
        String name = null;
        
        // When
        String result = sampleRule.greet(name);
        
        // Then
        assertThat(result).isEqualTo("Hello, World!");
    }
    
    @Test
    void shouldReturnDefaultGreetingWhenNameIsEmpty() {
        // Given
        String name = "";
        
        // When
        String result = sampleRule.greet(name);
        
        // Then
        assertThat(result).isEqualTo("Hello, World!");
    }
}

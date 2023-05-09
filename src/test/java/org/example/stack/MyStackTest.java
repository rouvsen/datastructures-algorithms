package org.example.stack;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MyStackTest {

    @Test
    void shouldPopWhenStackHasValues() {
        MyStack<Integer> stack = new MyStack<>(3);
        stack.push(3);
        stack.push(7);
        assertThat(stack.pop()).isEqualTo(7);
        assertThat(stack.pop()).isEqualTo(3);
    }

    @Test
    void shouldReturnNullWhenStackIsEmpty() {
        MyStack<Integer> stack = new MyStack<>(3);
        assertThat(stack.pop()).isNull();
    }

    @Test
    void shouldFailWhenPushingToAFullStack() {
        MyStack<Integer> stack = new MyStack<>(2);
        stack.push(1);
        stack.push(2);

        assertThatThrownBy(() -> stack.push(3))
             .isInstanceOf(RuntimeException.class)
             .hasMessage("Sorry stack is full");
    }

    @Test
    void shouldPeekWhenStackHasValues() {
        MyStack<Integer> stack = new MyStack<>(3);//null currently

        assertThat(stack.peek()).isNull();//yes

        stack.push(1);
        stack.push(2);//last val is 2 now
        assertThat(stack.peek()).isEqualTo(2);//peek returns last value
        assertThat(stack.peek()).isEqualTo(2);//peek returns last value
        assertThat(stack.peek()).isEqualTo(2);//peek returns last value..everytime
    }

    @Test
    void shouldAlsoWorkWithStringTypes() {
        MyStack<String> stack = new MyStack<>(2);
        stack.push("Baku");
        stack.push("Los Angeles");

        assertThat(stack.pop()).isEqualTo("Los Angeles");
        assertThat(stack.pop()).isEqualTo("Baku");
    }

}
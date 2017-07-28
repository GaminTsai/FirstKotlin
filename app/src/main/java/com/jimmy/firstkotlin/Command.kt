package com.jimmy.firstkotlin

public interface Command<T> {
    fun execute(): T
}
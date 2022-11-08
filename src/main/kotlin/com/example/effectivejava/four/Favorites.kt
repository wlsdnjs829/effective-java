package com.example.effectivejava.four

import kotlin.reflect.KClass

class Favorites {

    private val favorites: MutableMap<Class<*>, Any> = mutableMapOf()

    private fun <T : Any> putFavorite(type: Class<T>, instant: T) {
        favorites[type] = instant
    }

    private fun <T : Any> getFavorite(type: KClass<T>): T = type.javaObjectType.cast(favorites[type.java])

    fun main() {
        val f = Favorites()

        f.putFavorite(String::class.java, "Java")
        f.putFavorite(Int::class.java, 0xcafebabe.toInt())
        f.putFavorite(Class::class.java, Favorites::class.java)

        val favoriteString = f.getFavorite(String::class)
        val favoriteInt = f.getFavorite(Int::class)
        val favoriteClass = f.getFavorite(Class::class)

        println("$favoriteString $favoriteInt ${favoriteClass.name}")
    }

}
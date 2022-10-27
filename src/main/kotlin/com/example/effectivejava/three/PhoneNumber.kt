package com.example.effectivejava.three

class PhoneNumber : Cloneable {

    override fun clone(): PhoneNumber {
        return super.clone() as PhoneNumber
    }

}
package com.er453r.calendars.external

external class EditSession {
    fun on(event:String, callback:()->Unit)
    fun getValue():String
    fun setValue(string:String)
}

external class Editor {
    fun getSession():EditSession
}

external class Ace {
    fun edit(id:String):Editor
}

@JsModule("ace-builds")
external val ace:Ace = definedExternally
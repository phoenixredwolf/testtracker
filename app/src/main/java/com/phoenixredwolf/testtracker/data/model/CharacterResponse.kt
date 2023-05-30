package com.phoenixredwolf.testtracker.data.model

data class CharacterResponse(
    val Abstract: String? = null,
    val AbstractSource: String? = null,
    val AbstractText: String? = null,
    val AbstractURL: String? = null,
    val Answer: String? = null,
    val AnswerType: String? = null,
    val Definition: String? = null,
    val DefinitionSource: String? = null,
    val DefinitionURL: String? = null,
    val Entity: String? = null,
    val Heading: String? = null,
    val Image: String? = null,
    val ImageHeight: Int? = null,
    val ImageIsLogo: Int? = null,
    val ImageWidth: Int? = null,
    val Infobox: String? = null,
    val Redirect: String? = null,
    var RelatedTopics: List<RelatedTopic?>? = null,
    val Results: List<Any?>? = null,
    val Type: String? = null,
    val meta: Meta? = null
)
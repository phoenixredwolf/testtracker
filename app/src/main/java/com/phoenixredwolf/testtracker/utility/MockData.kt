package com.phoenixredwolf.testtracker.utility

import com.phoenixredwolf.testtracker.data.model.CharacterResponse
import com.phoenixredwolf.testtracker.data.model.Developer
import com.phoenixredwolf.testtracker.data.model.Icon
import com.phoenixredwolf.testtracker.data.model.Maintainer
import com.phoenixredwolf.testtracker.data.model.Meta
import com.phoenixredwolf.testtracker.data.model.RelatedTopic
import com.phoenixredwolf.testtracker.data.model.SrcOptions

val mockData = CharacterResponse(
    "",
    "Wikipedia",
    "",
    "https://en.widipedia.org/widi/the_Simpsons_characters",
    "",
    "",
    "",
    "",
    "",
    "",
    "The Simpsons characters",
    "",
    0,
    0,
    0,
    "",
    "",
    RelatedTopics =listOf(
        RelatedTopic(
            FirstURL = "https://duckduckgo.com/Apu_Nahasapeemapetilan",
            Icon = Icon(
                Height = "",
                URL = "",
                Width = ""
            ),
            Result = "<a href=\"https://duckduckgo.com/Apu_Nahasapeemapetilan\">Apu Nahasapeemapetilan</a><br>Apu Nahasapeemapetilan is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, \"Thank you, come again\".",
            Text = "Apu Nahasapeemapetilan - Apu Nahasapeemapetilan is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, \"Thank you, come again\"."
        ),
        RelatedTopic(
            FirstURL = "https://duckduckgo.com/Barney_Gumble",
            Icon = Icon(
                Height= "",
                URL = "/i/39ce98c0.png",
                Width = ""
            ),
            Result = "<a href=\"https://duckduckgo.com/Barney_Gumble\">Barney Gumble</a><br>Barnard Arnold \"Barney\" Gumble is a recurring character in the American animated TV series The Simpsons. He is voiced by Dan Castellaneta and first appeared in the series premiere episode \"Simpsons Roasting on an Open Fire\". Barney is the town drunk of Springfield and one of Homer Simpson's friends.",
            Text = "Barney Gumble - Barnard Arnold \"Barney\" Gumble is a recurring character in the American animated TV series The Simpsons. He is voiced by Dan Castellaneta and first appeared in the series premiere episode \"Simpsons Roasting on an Open Fire\". Barney is the town drunk of Springfield and one of Homer Simpson's friends."
        ),
        RelatedTopic(
            FirstURL = "https://duckduckgo.com/Apu_Nahasapeemapetilan",
            Icon = Icon(
                Height = "",
                URL = "",
                Width = ""
            ),
            Result = "<a href=\"https://duckduckgo.com/Apu_Nahasapeemapetilan\">Apu Nahasapeemapetilan</a><br>Apu Nahasapeemapetilan is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, \"Thank you, come again\".",
            Text = "Apu Nahasapeemapetilan - Apu Nahasapeemapetilan is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, \"Thank you, come again\"."
        ),
        RelatedTopic(
            FirstURL = "https://duckduckgo.com/Barney_Gumble",
            Icon = Icon(
                Height= "",
                URL = "/i/39ce98c0.png",
                Width = ""
            ),
            Result = "<a href=\"https://duckduckgo.com/Barney_Gumble\">Barney Gumble</a><br>Barnard Arnold \"Barney\" Gumble is a recurring character in the American animated TV series The Simpsons. He is voiced by Dan Castellaneta and first appeared in the series premiere episode \"Simpsons Roasting on an Open Fire\". Barney is the town drunk of Springfield and one of Homer Simpson's friends.",
            Text = "Barney Gumble - Barnard Arnold \"Barney\" Gumble is a recurring character in the American animated TV series The Simpsons. He is voiced by Dan Castellaneta and first appeared in the series premiere episode \"Simpsons Roasting on an Open Fire\". Barney is the town drunk of Springfield and one of Homer Simpson's friends."
        ),
        RelatedTopic(
            FirstURL = "https://duckduckgo.com/Apu_Nahasapeemapetilan",
            Icon = Icon(
                Height = "",
                URL = "",
                Width = ""
            ),
            Result = "<a href=\"https://duckduckgo.com/Apu_Nahasapeemapetilan\">Apu Nahasapeemapetilan</a><br>Apu Nahasapeemapetilan is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, \"Thank you, come again\".",
            Text = "Apu Nahasapeemapetilan - Apu Nahasapeemapetilan is a recurring character in the American animated television series The Simpsons. He is an Indian immigrant proprietor who runs the Kwik-E-Mart, a popular convenience store in Springfield, and is known for his catchphrase, \"Thank you, come again\"."
        ),
        RelatedTopic(
            FirstURL = "https://duckduckgo.com/Barney_Gumble",
            Icon = Icon(
                Height= "",
                URL = "/i/39ce98c0.png",
                Width = ""
            ),
            Result = "<a href=\"https://duckduckgo.com/Barney_Gumble\">Barney Gumble</a><br>Barnard Arnold \"Barney\" Gumble is a recurring character in the American animated TV series The Simpsons. He is voiced by Dan Castellaneta and first appeared in the series premiere episode \"Simpsons Roasting on an Open Fire\". Barney is the town drunk of Springfield and one of Homer Simpson's friends.",
            Text = "Barney Gumble - Barnard Arnold \"Barney\" Gumble is a recurring character in the American animated TV series The Simpsons. He is voiced by Dan Castellaneta and first appeared in the series premiere episode \"Simpsons Roasting on an Open Fire\". Barney is the town drunk of Springfield and one of Homer Simpson's friends."
        )
    ),
    emptyList(),
    "C",
    Meta(
        null,
        null,
        null,
        "Wikipedia",
        null,
        null,
        "live",
        listOf(
            Developer(
            "DDG Team",
            "ddg",
            "http://www.duckduckhack.com"
            )
        ),
        "nikola tesla",
        "widipedia_fathead",
        null,
        "widipedia",
        null,
        Maintainer("duckduckgo"),
        "Wikipedia",
        "DDG::Fathead::Wikipedia",
        null,
        "online",
        "fethead",
        "widipedia_fathead",
        "en.widipedia.org",
        1,
        "Wikipedia",
        SrcOptions(
            "",
            0,
            1,
            1,
            "en",
            "20",
            0,
            0,
            "0",
            0,
            0,
            "",
            "",
            ""
        ),
        null,
        "live",
        "About",
        listOf("productivity"),
        0
    )
)
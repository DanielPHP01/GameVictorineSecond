package com.example.gamevictorinesecond

class QuizBank {
    private fun kievQuestions(): List<QuizList>? {
        val questionsList: MutableList<QuizList> = ArrayList()
        val question1 = QuizList(
            "В какой стране находится Киев?",
            "В Казахстане.", "В Украине.", "В Великобритании.", "В Канаде.",
            "В Украине.", ""
        )
        val question2 = QuizList(
            "На какой реке расположен Киев?",
            "Днепр.", "Днестр.", "Днеев.", "Амазонка.",
            "Днепр.", ""
        )
        val question3 = QuizList(
            "Какая футбольная команда есть в Киеве?",
            "Спартак.", "Манчестер.", "Бавария.", "Динамо.",
            "Динамо.", ""
        )
        val question4 = QuizList(
            "Какие ворота есть в Киеве?",
            "Бронзовые.", "Серебряные.", "Золотые.", "Пластмассовые.",
            "Золотые.", ""
        )
        val question5 = QuizList(
            "Какой спортсмен был мэром Киева?",
            "Хоккеист.", "Бабслеист.", "Боксёр.", "Конькобежец.",
            "Боксёр.", ""
        )
        val question6 = QuizList(
            "Каких деревьев много в Киеве?",
            "Каштанов.", "Тополей.", "Пальм.", "Берёз.",
            "Каштанов.", ""
        )
        val question7 = QuizList(
            "Сколько районов находится на левом берегу Днепра?",
            "Один.", "Два.", "Три.", "Четыре.",
            "Три.", ""
        )
        val question8 = QuizList(
            "Какого памятника архитектуры нет в Киеве?",
            "Церковь Спаса-на-Берестове.", "Дом с химерами.", "Старая биржа.", "Пальма Мерцалова.",
            "Старая биржа.", ""
        )
        val question9 = QuizList(
            "В каком году основан Киев?",
            "В 482 году.", "В 283 до Р.Х.", "В 1256 году.", "В 988 году.",
            "В 482 году.", ""
        )
        val question10 = QuizList(
            "На какой широте находится Киев?",
            "23 ю.ш.", "75 с.в.", "33 ю.д.", "50 с.ш.",
            "50 с.ш.", ""
        )
        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)
        questionsList.add(question4)
        questionsList.add(question5)
        questionsList.add(question6)
        questionsList.add(question7)
        questionsList.add(question8)
        questionsList.add(question9)
        questionsList.add(question10)
        return questionsList
    }

    private fun ukraineQuestions(): List<QuizList>? {
        val questionsList: MutableList<QuizList> = ArrayList()
        val question1 = QuizList(
            "На каком континенте находится Украина?",
            "Северной Америке.", "Евразии.", "Европе.", "Африке.",
            "Евразии.", ""
        )
        val question2 = QuizList(
            "Легендарные украинские воины?",
            "Викинги.", "Казаки.", "Асасины.", "Ниндзи.",
            "Казаки.", ""
        )
        val question3 = QuizList(
            "Что любят есть украинцы?",
            "Сало.", "Фуагру.", "Пиццу.", "Хот-Доги.",
            "Сало.", ""
        )
        val question4 = QuizList(
            "Какой области нет в Украине?",
            "Днепропетровской.", "Киевской.", "Хмельницкой.", "Луцкой.",
            "Луцкой.", ""
        )
        val question5 = QuizList(
            "Столица Украины?",
            "Львов.", "Киев.", "Харьков.", "Винница.",
            "Киев.", ""
        )
        val question6 = QuizList(
            "Какое море есть в Украине?",
            "Чёрное.", "Красное.", "Белое.", "Жёлто-голубое.",
            "Чёрное.", ""
        )
        val question7 = QuizList(
            "День независимости в Украине отмечают?",
            "29 февраля.", "28 мая.", "24 августа.", "1 апреля.",
            "24 августа.", ""
        )
        val question8 = QuizList(
            "Кто изображён на купюре 10 гривен?",
            "Иван Мазепа.", "Ксена.", "Владимир Великий.", "Ярослав Мудрый.",
            "Иван Мазепа.", ""
        )
        val question9 = QuizList(
            "Протяжённость береговой линии Украины",
            "2835 км.", "8235 км.", "2853 км.", "2385 км.",
            "2835 км.", ""
        )
        val question10 = QuizList(
            "Самая высокая гора в Украине?",
            "Гуцул-гора.", "Петрос.", "Говерла.", "Джамалунгма.",
            "Говерла.", ""
        )
        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)
        questionsList.add(question4)
        questionsList.add(question5)
        questionsList.add(question6)
        questionsList.add(question7)
        questionsList.add(question8)
        questionsList.add(question9)
        questionsList.add(question10)
        return questionsList
    }

    private fun donetskQuestions(): List<QuizList>? {
        val questionsList: MutableList<QuizList> = ArrayList()
        val question1 = QuizList(
            "В какой стране находится Донецк?",
            "Лилипутии.", "Румынии.", "США.", "Украине.",
            "Украине.", ""
        )
        val question2 = QuizList(
            "Как раньше назывался Донецк?",
            "Сталино.", "Ленино.", "Ворошилово.", "Гродно.",
            "Сталино.", ""
        )
        val question3 = QuizList(
            "Главная футбольная команда в городе Донецк это?",
            "Кальмиус.", "Проходчик.", "Шахтёр.", "Моряк.",
            "Шахтёр.", ""
        )
        val question4 = QuizList(
            "Главная улица в городе Донецк?",
            "Ахметова.", "Сергея.", "Андрея.", "Артёма.",
            "Артёма.", ""
        )
        val question5 = QuizList(
            "Основатель города Донецк?",
            "Джон Юз.", "Джонни Дэп.", "Бэлл Окленд.", "Артём Статский.",
            "Джон Юз.", ""
        )
        val question6 = QuizList(
            "Какая река есть в Донецке?",
            "Дунай.", "Кальмиус.", "Днестр.", "Волга.",
            "Кальмиус.", ""
        )
        val question7 = QuizList(
            "Как называется цырк в городе Донецк?",
            "Небесный.", "Облако.", "Звериный.", "Космос.",
            "Космос.", ""
        )
        val question8 = QuizList(
            "В 'Донецке растёт \"одна пальма\". Её название \"...\" Мерцалова?",
            "Пальма Мерцалова.", "Пальма Охотского.", "Пальма Булаха.", "Пальма воздвижения.",
            "Пальма Мерцалова.", ""
        )
        val question9 = QuizList(
            "Какие курганы спят в Донецкой области?",
            "Высокие.", "Тёмные.", "Каменные.", "Угольные.",
            "Тёмные.", ""
        )
        val question10 = QuizList(
            "Везде горы, а в Донецке?",
            "Терриконы.", "Овраги.", "Вулканы.", "Скалы.",
            "Терриконы.", ""
        )
        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)
        questionsList.add(question4)
        questionsList.add(question5)
        questionsList.add(question6)
        questionsList.add(question7)
        questionsList.add(question8)
        questionsList.add(question9)
        questionsList.add(question10)
        return questionsList
    }

    private fun ugledarQuestions(): List<QuizList>? {
        val questionsList: MutableList<QuizList> = ArrayList()
        val question1 = QuizList(
            "На какой планете находится Угледар?",
            "Земля.", "Марс.", "Юпирер.", "Венера.",
            "Земля.", ""
        )
        val question2 = QuizList(
            "Какой школы никогда не было в Угледаре?",
            "Первой.", "Сто двенадцатой.", "Четвёртой.", "Второй.",
            "Четвёртой.", ""
        )
        val question3 = QuizList(
            "Сколько шахт в Угледаре?",
            "Одна.", "Две.", "Три.", "Четыре.",
            "Две.", ""
        )
        val question4 = QuizList(
            "Какой улицы нет в Угледаре?",
            "13 десантников.", "30 Лет победы.", "48 Шахтёров.", "Мира.",
            "48 Шахтёров.", ""
        )
        val question5 = QuizList(
            "В каком году основан город Угледар?",
            "988 году.", "2000 году.", "1946 году.", "1964 году.",
            "1964 году.", ""
        )
        val question6 = QuizList(
            "Какого магазина никогда не было в Угледаре?",
            "Стекляшки", "Неваляшки.", "Цыганского.", "Людмилы.",
            "Неваляшки.", ""
        )
        val question7 = QuizList(
            "Какой посёлок есть в Угледаре?",
            "Новый посёлок.", "Старый посёлок.", "Западный посёлок.", "Восточный посёлок.",
            "Старый посёлок.", ""
        )
        val question8 = QuizList(
            "В Угледаре есть?",
            "Профилакторий.", "Вич диспансер.", "Психиатрическая лечебница.", "Роддом.",
            "Профилакторий.", ""
        )
        val question9 = QuizList(
            "Летом жители Угледара отдыхают?",
            "На Канарах.", "На Никольском ставке.", "На Никольских островах.", "На диване.",
            "На Никольском ставке.", ""
        )
        val question10 = QuizList(
            "Самая высокая гора в Угледаре?",
            "Годзила гора.", "Чебурашка гора.", "Кинг-Конг гора.", "Уголь гора.",
            "Кинг-Конг гора.", ""
        )
        questionsList.add(question1)
        questionsList.add(question2)
        questionsList.add(question3)
        questionsList.add(question4)
        questionsList.add(question5)
        questionsList.add(question6)
        questionsList.add(question7)
        questionsList.add(question8)
        questionsList.add(question9)
        questionsList.add(question10)
        return questionsList
    }

    fun qetQuestions(selectedTopicName: String?): List<QuizList>? {
        return when (selectedTopicName) {
            "volleyball" -> kievQuestions()
            "football" -> ukraineQuestions()
            "basketball" -> donetskQuestions()
            else -> ugledarQuestions()
        }
    }
}
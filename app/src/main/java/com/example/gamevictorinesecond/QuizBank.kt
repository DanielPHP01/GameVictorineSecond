package com.example.gamevictorinesecond

class QuizBank {
    private fun footballQustions(): List<QuizList>? {
        val questionsList: MutableList<QuizList> = ArrayList()
        val question1 = QuizList(
            "Who is the all-time leading scorer in the English Premier League?",
            "Alan Shearer", "Thierry Henry", "Wayne Rooney", "Frank Lampard",
            "Alan Shearer", ""
        )
        val question2 = QuizList(
            "Who won the most recent World Cup in Soccer?",
            "Spain", "Germany", "France", "Brazil",
            "France", ""
        )
        val question3 = QuizList(
            "Who has won the most Ballon d'Or awards (best player in the world)?",
            "Lionel Messi", "Cristiano Ronaldo", "Michel Platini", "Johan Cruyff",
            "Lionel Messi", ""
        )
        val question4 = QuizList(
            "What team has won the most Champions League/European Cup titles?",
            "Real Madrid", "Bayern Munich", "AC Milan", "Liverpool",
            "Real Madrid", ""
        )
        val question5 = QuizList(
            "Who is the all-time leading scorer for the Argentine National Team?",
            "Diego Maradona", "Lionel Messi", "Gabriel Batistuta", "Alfredo Di Stefano",
            "Lionel Messi", ""
        )
        val question6 = QuizList(
            "What team won the first FIFA Club World Cup in 2000?",
            "Corinthians", "Real Madrid", "Manchester United", "Bayern Munich",
            "Corinthians", ""
        )
        val question7 = QuizList(
            "Who is the only player to have won the World Cup as both a player and coach?",
            "Zinedine Zidane", "Franz Beckenbauer", " Diego Maradona", "Michel Platini",
            "Franz Beckenbauer", ""
        )
        val question8 = QuizList(
            "Who has won the most Golden Foot awards for the best goal scorer in a European season?",
            "Lionel Messi", "Cristiano Ronaldo", "Luis Suarez", "Robert Lewandowski",
            "Cristiano Ronaldo", ""
        )
        val question9 = QuizList(
            "Who is the only player to have won the Ballon d'Or award 5 times in a row?",
            "Lionel Messi", "Cristiano Ronaldo", "Zinedine Zidane", "Michel Platini",
            "Lionel Messi", ""
        )
        val question10 = QuizList(
            "Which team has won the most World Cup titles in Soccer?",
            "Brazil", "Germany", "Italy", "Argentina",
            "Brazil", ""
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

    private fun basketballQuestions(): List<QuizList>? {
        val questionsList: MutableList<QuizList> = ArrayList()
        val question1 = QuizList(
            "Who is the all-time leading scorer in NBA history?",
            "Kareem Abdul-Jabbar", "LeBron James", "Michael Jordan", "Wilt Chamberlain",
            "Kareem Abdul-Jabbar", ""
        )
        val question2 = QuizList(
            "What team has won the most NBA championships?",
            "Boston Celtics", "Los Angeles Lakers", "Chicago Bulls", "San Antonio Spurs",
            "Boston Celtics", ""
        )
        val question3 = QuizList(
            "Who is widely considered the greatest basketball player of all time?",
            "Michael Jordan", "Magic Johnson", "Kobe Bryant", "LeBron James",
            "Michael Jordan", ""
        )
        val question4 = QuizList(
            "Who is the all-time leading scorer for the US Men's Olympic Basketball Team?",
            "Carmelo Anthony", "Michael Jordan", "LeBron James", "Kobe Bryant",
            "Carmelo Anthony", ""
        )
        val question5 = QuizList(
            "What is the name of the award given to the top player in college basketball each year?",
            "Naismith Trophy", "Wooden Award", "Rupp Trophy", "Robertson Trophy",
            "Naismith Trophy", ""
        )
        val question6 = QuizList(
            "Who has won the most NBA MVP awards?",
            "Kareem Abdul-Jabbar", "LeBron James", "Michael Jordan", "Bill Russell",
            "Kareem Abdul-Jabbar", ""
        )
        val question7 = QuizList(
            "What team holds the record for the most regular season wins in a single season?",
            "Chicago Bulls", "Golden State Warriors", "Los Angeles Lakers", "Miami Heat",
            "Chicago Bulls", ""
        )
        val question8 = QuizList(
            "Who is the all-time leading scorer for the women's Olympic Basketball Team?",
            "Diana Taurasi", "Tamika Catchings", "Lisa Leslie", "Cheryl Miller",
            "Diana Taurasi", ""
        )
        val question9 = QuizList(
            "Who was the first overall pick in the 1996 NBA draft?",
            "Kobe Bryant", "Allen Iverson", "Steve Nash", "Ray Allen",
            "Allen Iverson", ""
        )
        val question10 = QuizList(
            "What is the name of the award given to the top defensive player in the NBA each year?",
            "All-Defensive Team", "DPOY Award", "Defense Trophy", "All-Defense Honors",
            "DPOY Award", ""
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

    private fun tennisQuestions(): List<QuizList>? {
        val questionsList: MutableList<QuizList> = ArrayList()
        val question1 = QuizList(
            "Who has won the most Grand Slam singles titles in tennis history?",
            "Serena Williams", "Margaret Court", "Steffi Graf", "Monica Seles",
            "Margaret Court", ""
        )
        val question2 = QuizList(
            "What is the name of the Grand Slam tournament played on clay courts?",
            "Wimbledon", "US Open", "Australian Open", "Roland Garros",
            "Roland Garros", ""
        )
        val question3 = QuizList(
            "Who is widely considered the greatest male tennis player of all time?",
            "Rafael Nadal", "Novak Djokovic", "Roger Federer", "Pete Sampras",
            "Roger Federer", ""
        )
        val question4 = QuizList(
            "Who holds the record for the most consecutive Grand Slam singles titles won in the Open Era?",
            "Steffi Graf", " Monica Seles", "Margaret Court", "Martina Navratilova",
            "Steffi Graf", ""
        )
        val question5 = QuizList(
            "What is the name of the award given to the best tennis player of the year in the ATP Tour?",
            "Tour Champion", "World No. 1", "ATP Finals Champion", "ATP World Tour Finals",
            "ATP Finals Champion", ""
        )
        val question6 = QuizList(
            "Who is the current world No. 1 in women's singles tennis?",
            "Naomi Osaka", "Simona Halep", "Ashleigh Barty", "Petra Kvitova",
            "Simona Halep", ""
        )
        val question7 = QuizList(
            "What is the name of the Grand Slam tournament played on grass courts?",
            "Roland Garros", "Australian Open", "Wimbledon", "US Open",
            "Wimbledon", ""
        )
        val question8 = QuizList(
            "Who has won the most Grand Slam doubles titles in tennis history?",
            "Martina Navratilova", "Billie Jean King", "Margaret Court", "Serena Williams",
            "Martina Navratilova", ""
        )
        val question9 = QuizList(
            "Who is the current world No. 1 in men's singles tennis?",
            "Rafael Nadal", "Novak Djokovic", "Roger Federer", "Stefanos Tsitsipas",
            "Novak Djokovic", ""
        )
        val question10 = QuizList(
            "What is the name of the award given to the best tennis player of the year in the WTA Tour?",
            "Tour Champion", "World No. 1", "WTA Finals Champion", "WTA Championships",
            "WTA Finals Champion", ""
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

    private fun volleyballQuestions(): List<QuizList>? {
        val questionsList: MutableList<QuizList> = ArrayList()
        val question1 = QuizList(
            "Who is the most decorated player in Olympic volleyball history?",
            "Karch Kiraly", "Gabrielle Reece", "Kerri Walsh Jennings", "Misty May-Treanor",
            "Karch Kiraly", ""
        )
        val question2 = QuizList(
            "What is the name of the award given to the best male volleyball player in the world?",
            "FIVB World Player of the Year", "MVP Award", "Olympic Champion", "World Champion",
            "FIVB World Player of the Year", ""
        )
        val question3 = QuizList(
            "Who is the current world No. 1 in women's beach volleyball?",
            "Barbora Hermannova & Marketa Slukova", "Alix Klineman & April Ross", "Laura Ludwig & Maggie Kozuch", "Sarah Pavan & Melissa Humana-Paredes",
            "Sarah Pavan & Melissa Humana-Paredes", ""
        )
        val question4 = QuizList(
            "What is the name of the governing body for international volleyball?",
            "World Volleyball Association", "International Volleyball Federation (FIVB)", "Volleyball World Cup", "Volleyball Olympics",
            "International Volleyball Federation (FIVB)", ""
        )
        val question5 = QuizList(
            "What is the name of the professional men's volleyball league in the United States?",
            "Major League Volleyball (MLV)", "United Volleyball League (UVL)", "National Volleyball League (NVL)", "USA Volleyball (USAV)",
            "USA Volleyball (USAV)", ""
        )
        val question6 = QuizList(
            "Who is the all-time leading scorer in Olympic volleyball history?",
            "Karch Kiraly", "Gabrielle Reece", "Kerri Walsh Jennings", "Regla Torres",
            "Karch Kiraly", ""
        )
        val question7 = QuizList(
            "What is the name of the award given to the best female volleyball player in the world?",
            "FIVB World Player of the Year", "MVP Award", "Olympic Champion", "World Champion",
            "FIVB World Player of the Year", ""
        )
        val question8 = QuizList(
            "What is the name of the Grand Slam tournament in beach volleyball?",
            "World Tour", "World Championships", "World Series", "World Cup",
            "World Tour", ""
        )
        val question9 = QuizList(
            "Who holds the record for the most Olympic gold medals in volleyball history?",
            "Karch Kiraly", "Gabrielle Reece", "Kerri Walsh Jennings", "Regla Torres",
            "Karch Kiraly", ""
        )
        val question10 = QuizList(
            "What is the name of the professional women's volleyball league in the United States?",
            "Major League Volleyball (MLV)", "United Volleyball League (UVL)", "National Volleyball League (NVL)", "American Volleyball Coaches Association (AVCA)",
            "American Volleyball Coaches Association (AVCA)", ""
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
            "football" -> footballQustions()
            "basketball" -> basketballQuestions()
            "tennis" -> tennisQuestions()
            else -> volleyballQuestions()
        }
    }
}
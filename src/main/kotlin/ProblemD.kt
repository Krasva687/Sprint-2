class ProblemD {

    fun main() {

        //ваша реализация в методе main
        //считываем количество компаний
        val countOfCompany = readInt()

        //открываем цикл для прохождения по компаниям
        for(i in 1..countOfCompany){

            //считываем количество людей в компании и количество денег у каждого человека в компании
            val countOfPeople = readInt()
            val moneyOfCompany = readLongArray(countOfPeople)

            //сортируем количество денег
            moneyOfCompany.sort()
            var resultMaxProfit = 0L

            //открываем цикл для поиска наибольшей выгоды для кафе
            for(j in 0..moneyOfCompany.size-1){

                //если у нас один человек максимальная выгода будет если бургер равняется количеству денег у покупателя
                if(moneyOfCompany.size == 1){
                    resultMaxProfit = moneyOfCompany[j]

                    //если больше одного покупателя, то ищем нибольшую выгоду от продажи
                }else if(resultMaxProfit < (moneyOfCompany[j] * (moneyOfCompany.size - j))){
                    resultMaxProfit = (moneyOfCompany[j]*(moneyOfCompany.size - j))
                    }
            }
            //выводим результат
            println(resultMaxProfit)
        }
    }

}
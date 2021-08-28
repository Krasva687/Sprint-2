class ProblemA {

    fun main() {

        //ваша реализация в методе main
        //читаем число запросов из первой строки
        val frogCount = readInt()

        //начинаем цикл для прохода по всем запросам
        for(i in 1..frogCount){
        //считываем массив прыжков лягушки
        val frogJumps = readListInt()
        //обнуляем первую координату для лягушки
            var frogEndCoordinate = 0L
            //считаем конечную координату для каждого запроса
        for(j in frogJumps.indices){

            if((j + 1) % 2 == 1){
                frogEndCoordinate += frogJumps[j]

            } else if((j + 1) % 2 == 0) {
                frogEndCoordinate -= frogJumps[j]
            }

        }
            //выводим в консоль где остановилась лягушка
            println(frogEndCoordinate)
        }

    }

}
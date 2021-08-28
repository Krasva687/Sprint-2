import org.springframework.expression.common.ExpressionUtils.toInt

class ProblemB {

    fun main() {

        //ваша реализация в методе main
        //считываем количество запросов
        val count = readInt()
        //открываем цикл для создания строк с алфавитом
        for (i in 1..count) {
            //считываем условия строки
            val stringLengthCountLetter = readListInt()

            var finishString = ""
            var countLoop = 0
            //цикл для заполенения строки
            for (k in 1..stringLengthCountLetter[0]) {
                //добовлаяем букву по ascii
                finishString = finishString + ('a' + countLoop)
                //если мы уже полностью прошли все буквы то идем по новой
                if (countLoop == stringLengthCountLetter[1]-1) {
                    countLoop = 0
                }else {
                    countLoop++
                }
            }
            //выводим сформированую строку
            println(finishString)

        }

    }
}
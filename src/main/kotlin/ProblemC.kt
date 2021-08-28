class ProblemC {

    fun main() {

        //ваша реализация в методе main
        //Считываем количество студентов и их скилы
        val countOfStudent = readInt()
        val studentAndSkills = readIntArray(countOfStudent)
        //сортируем муровень скилов по
        studentAndSkills.sort()

        var countExcersice = 0

        for(i in 0..(countOfStudent - 1) step 2){
            countExcersice += studentAndSkills[i+1] - studentAndSkills[i]

        }
        println(countExcersice)
    }

}
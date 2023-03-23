package SecondLesson

fun main() {

    val countOfEmployees = 50
    val salaryOfEachEmployee = 30000
    val countOfTrainees = 20
    val salaryOfEachTrainee = 20000
    val totalSalaryOfEmployees = countOfEmployees * salaryOfEachEmployee
    val totalSalaryOfTrainees = countOfTrainees * salaryOfEachTrainee
    val averageSalary = (totalSalaryOfEmployees + totalSalaryOfTrainees) / (countOfTrainees + countOfEmployees)

    println("Выплаты постоянным сотрудникам: $totalSalaryOfEmployees RUB")
    println("Выплаты стажерам: $totalSalaryOfTrainees RUB")
    println("Средняя выплата на одного сотрудника: $averageSalary RUB")
}
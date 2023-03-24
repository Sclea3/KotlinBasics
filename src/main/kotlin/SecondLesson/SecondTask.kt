package SecondLesson

fun main() {

    val countOfEmployees = 50
    val salaryOfEachEmployee = 30000
    val countOfTrainees = 30
    val salaryOfEachTrainee = 20000
    val totalSalaryOfEmployees = countOfEmployees * salaryOfEachEmployee
    val totalSalaryOfTrainees = countOfTrainees * salaryOfEachTrainee
    val totalSalary = totalSalaryOfEmployees + totalSalaryOfTrainees
    val averageSalary = (totalSalaryOfEmployees + totalSalaryOfTrainees) / (countOfTrainees + countOfEmployees)

    println("Выплаты постоянным сотрудникам: $totalSalaryOfEmployees RUB")
    println("Общие выплаты: $totalSalary RUB")
    println("Средняя выплата на одного сотрудника: $averageSalary RUB")
}
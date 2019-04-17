package varable

/**
 * 闭包的委托策略
 */
class Student{
    String name
    def pretty = {
        "My name is ${name}"
    }
    String toString(){
        pretty.call()
    }
}
class Teacher{
    String name
}
def student = new Student(name: "Tea")
def teacher = new Teacher(name: "Tom")

println(student.toString())

student.pretty.delegate = teacher
//delegate默认委托策略是owner,修改委托策略默认为delegate
student.pretty.resolveStrategy = Closure.DELEGATE_FIRST

println(student.toString())



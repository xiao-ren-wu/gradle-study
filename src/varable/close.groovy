package varable
//
//def clouse = {
//    String name ->
//        println "Hello ${name}"
//        return name
//}
//
//clouse("Groovy")
//clouse.call("Groovy")
//
//def clouse1 = {
//    println "Hello${it}"
//}
//def result = clouse1("Groovy")
//println(result)
//
//int x = fab(5)
//println(x)
//
//int fab(int number) {
//    int result = 1
//    1.upto(number, { num -> result *= num })
//    return result
//}

def scriptClouser = {
    println "scriptClouser this:" + this //代表闭包定义所处的类
    println "scriptClouser owner:" + owner //代表闭包定义所处的类或者对象
    println "scriptClouser delegate:" + delegate //代表任意对象；默认与owner一致

}
//scriptClouser.call()
class Person {
    def static classClouer = {
        println "classClouser this:" + this //代表闭包定义所处的类
        println "classClouser owner:" + owner //代表闭包定义所处的类或者对象
        println "classClouser delegate:" + delegate //代表任意对象；默认与owner一致
    }
    def static say(){
        def classClouer = {
            println "methodClouser this:" + this //代表闭包定义所处的类
            println "methodClouser owner:" + owner //代表闭包定义所处的类或者对象
            println "methodClouser delegate:" + delegate //代表任意对象；默认与owner一致
        }
        classClouer.call()
    }
}

Person.say()
Person.classClouer.call()

def nestClouser={
    def innerClass = {
        println "innerClouser this:" + this //代表闭包定义所处的类
        println "innerClouser owner:" + owner //代表闭包定义所处的类或者对象
        println "innerClouser delegate:" + delegate //代表任意对象；默认与owner一致
    }
    innerClass.call()
}
nestClouser.call()








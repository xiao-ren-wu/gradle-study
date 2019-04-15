package varable

def clouse = {
    String name ->
        println "Hello ${name}"
        return name
}

clouse("Groovy")
clouse.call("Groovy")

def clouse1 = {
    println "Hello${it}"
}
def result = clouse1("Groovy")
println(result)

int x = fab(5)
println(x)

int fab(int number) {
    int result = 1
    1.upto(number, { num -> result *= num })
    return result
}

def scriptClouser = {
    println "scriptClouser this:"+this //代表闭包定义所处的类
    println "scriptClouser owner:"+owner //代表闭包定义所处的类或者对象
    println "scriptClouser delegate:"+ delegate //代表任意对象；默认与owner一致

}
scriptClouser.call()

/**
 * 闭包的委托策略
 */











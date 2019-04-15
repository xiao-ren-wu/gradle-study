# :fish:gradle-study
## DSL介绍（domain specific language）

1. matlab、html、xml等都是dsl语言，领域特定为了解决某一领域的问题。dsl语言的初衷就是为了解决某一特定领域的问题。

## groovy介绍

1. 是一种基于JVM的敏捷开发语言
   1. groovy不仅可以源文件编译成字节码文件通过交给JVM执行还可以像js一样**解释执行~**
2. 结合了Python、Ruby、Smalltalk的许多强大特性
3. groovy可以与java完美结合，并且可以使用java所有的库！

### groovy特性

1. 语法上支持动态类型，闭包等新一代语言的特性
2. 无缝集成所有已经存在的Java类库
3. 支持面向对象编程也支持面向过程编程

------------------------------

# :memo:吹水完毕~开始干活！

### 变量

groovy提供了和java一样的变量类型：int、char、boolean、balabala........但是无论哪种变量类型，groovy最终都会装换成对象类型。

~~~groovy
int x = 10
boolean f = false

println x.class

println f.class
~~~

out:

~~~
class java.lang.Integer
class java.lang.Boolean
~~~

#### 变量的定义

弱类型定义方式：不指定变量类型使用`def`关键字定义变量，通过变量的值，编译器自动推断并转换变量类型。

~~~groovy
def x = 1
~~~

##### `String`

**普通String**

~~~groovy
def str = 'hello str'
~~~

##### 三引号字符串（自由书写输出形式~）

**定义方式**

传统java的string如果想在输出的时某些地方换行需要插入`r\n`GString不需要插入这些字符，可以实现怎么书写的怎么输出的，直接可以实现换行。

~~~groovy
def thupleName = '''\
line one
line two
line three'''
print(thupleName)
~~~

out:

~~~
line one
line two
line three
~~~

**双引号字符串**

`GString`提供在字符串中使用拓展表达式

```groovy
def name = "Groovy"
def doubleName = "Hello: ${name}"
println(doubleName)
println(name.class)
println(doubleName.class)
```

out:

~~~
Hello: Groovy
class java.lang.String
class org.codehaus.groovy.runtime.GStringImpl
~~~

**如果字符串中有拓展表达式，自动使用GString，如果没有拓展表达式自动使用java.lang.String**

拓展表达式里面不仅可以是变量的引用，还可以是任意表达式

eg:

`${3+4}`

#### 流程控制

Groovy增强了switch case，判断条件可以是任何值，同一个switch结构中case的表达式的类型也可以不一样。

eg:

~~~groovy
def x = 1.23
def result
switch (x) {
    case 'foo':
        result = 'found foo'
        break
    case 'bar':
        result = 'fond bar'
        break
    case [4, 5, 6, 'list']:
        result = 'list'
        break
    case 12..30:
        result = 'range'
        break
    case BigDecimal:
        result = 'bigDecimal'
        break
    default:
        result = 'none'
        break
}
println(result)
~~~

**for循环plus**

~~~groovy

def sum = 0
/**
 * 对范围进行循环
 */
for (i in 0..9) {
    sum += i
}
println(sum)

/**
 * 对List的循环
 */
for (i in [1, 2, 3, 4, 5, 6, 7, 8, 9]) {
    sum += i
}

/**
 * 对Map进行循环
 */
for (i in ['lili': 1, 'luck': 2, 'xiaoming': 3]) {
    sum += i.value
}
~~~

### :lion:闭包

 **声明方式**

def 包名 = {参数列表 -> 包体 return 返回值}

~~~groovy
def clouse = {
    String name->
        println "Hello ${name}"
        return name
}

clouse("Groovy")
clouse.call("Groovy")
~~~

如果没有参数列表，Groovy自动提供参数名为it的参数作为入参，如果没有返回中默认返回null

```groovy
def clouse1 = {
    println "Hello ${it}"
}
def result = clouse1("Groovy")
println(result)
```

### n:闭包

out

~~~
HelloGroovy
null
~~~

闭包与函数结合使用

```groovy
int x = fab(5)
println(x)
int fab(int number) {
    int result = 1
    //可以无缝的使用闭包，相当于函数体的一部分，比调用函数的粒度更低~
    1.upto(number, { num -> result *= num })
    return result
}
```

 `this` :代表闭包定义所处的类

`owner `:代表闭包定义所处的类或者对象

`delegate` :代表任意对象；默认与owner一致

### 列表






















































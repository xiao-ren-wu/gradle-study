package objector
def demo = new Demo()
demo.cry()

//为类动态的添加一个属性
Demo.metaClass.hello = 'hello'
def d1 = new Demo()
println(d1.hello)

//为类动态的添加方法
Demo.metaClass.setUpperCase = {-> hello.toUpperCase()}
def d2 = new Demo()
println(d2.setUpperCase())

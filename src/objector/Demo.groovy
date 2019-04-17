package objector

/**
 * 1.groovy中默认都是public
 */
class Demo {

    /**
     * 当方法找不到时，会调用该方法
     * @param name 调用的方法名称
     * @param args 方法的参数列表
     * @return def
     */
    def invokeMethod(String name,Object args){
        println("The method is ${name},the params is ${args}")
    }

    /**
     * 当找不到调用的方法的时候。会优先于invokeMethod调用该方法
     * @param name 调用的方法名称
     * @param args 方法的参数列表
     * @return def
     */
    def methodMissing(String name,Object args){
        println("The method ${name} is missing~")
    }
}

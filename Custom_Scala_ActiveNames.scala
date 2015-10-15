//#Patterns: Custom_Scala_ActiveNames
package docs.tests

class Foo{

    //#Warn: Custom_Scala_ActiveNames
    def setCount(i:Int) = {}
}

trait Bar{

    //#Warn: Custom_Scala_ActiveNames
    def setDependency(d:Dependency) = {}
}

object Baz{

    //#Warn: Custom_Scala_ActiveNames
    def setMeFree(b:Baz) = {}

    def falseSetPositive(s:S) = {}
}
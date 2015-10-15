//#Patterns: Custom_Scala_GroupImports
package docs.tests

//#Warn: Custom_Scala_GroupImports
import foo.bar.Baz
import foo.bar.Baz2

object MyObject{

    def foo(i:Int) = i.toString

    def foo2(i:Int) = i.toString.reverse

}
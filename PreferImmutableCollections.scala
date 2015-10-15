//#Patterns: Custom_Scala_PreferImmutableCollections
package test1{
  //#Warn: Custom_Scala_PreferImmutableCollections
  import scala.collection.mutable.Set
  
  object Foo{
    val t = Set
  }

}
package test2{
  //#Warn: Custom_Scala_PreferImmutableCollections
  import scala.collection.mutable

  object Foo{
    //#Warn: Custom_Scala_PreferImmutableCollections
    val t = mutable.Buffer

  }
}

package test3{

  object Foo{
    //#Warn: Custom_Scala_PreferImmutableCollections
    val b = scala.collection.mutable.Buffer

  }

}

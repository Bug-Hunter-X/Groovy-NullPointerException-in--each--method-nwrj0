```groovy
def someMethod() {
  def list = [1, 2, 3, null, 5]
  list.each { element ->
    println element * 2 //This will cause a NullPointerException
  }
}
someMethod()
```
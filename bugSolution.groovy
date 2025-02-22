```groovy
def someMethod() {
  def list = [1, 2, 3, null, 5]
  list.each { element ->
    if (element != null) {
      println element * 2
    } else {
      println "Null element encountered"
    }
  }
}
someMethod()
```
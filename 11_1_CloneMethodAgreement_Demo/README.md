## 第三章 对于所有对象都通用的方法

#### 第11条：谨慎的覆盖clone

neCloneable接口的作用就是在调用父类的clone方法时不会抛出异常，如果有必要，需要提供一个deepCopy方法clone元素。
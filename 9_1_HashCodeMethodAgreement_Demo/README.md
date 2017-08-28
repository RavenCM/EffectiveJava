## 第三章 对于所有对象都通用的方法

#### 第9条：覆盖equals时总要覆盖hashCode

HashMap、HashSet在get方法时都会先判断hashCode是否相等，然后再去用equals方法判断，所以覆盖了equals必须覆盖hashCode
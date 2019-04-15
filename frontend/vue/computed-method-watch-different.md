作用机制上
1.watch和computed都是以Vue的依赖追踪机制为基础的，它们都试图处理这样一件事情：当某一个数据（称它为依赖数据）发生变化的时候，所有依赖这个数据的“相关”数据“自动”发生变化，也就是自动调用相关的函数去实现数据的变动。
2.对methods:methods里面是用来定义函数的，很显然，它需要手动调用才能执行。而不像watch和computed那样，“自动执行”预先定义的函数
【总结】：methods里面定义的函数，是需要主动调用的，而和watch和computed相关的函数，会自动调用,完成我们希望完成的作用
从性质上看
1.methods里面定义的是函数，你显然需要像"fuc()"这样去调用它（假设函数为fuc）
2.computed是计算属性，事实上和data对象里的数据属性是同一类的（使用上）,
例如：
```javascript
computed:{
    fullName: function () { return  this.firstName + lastName }
}
```

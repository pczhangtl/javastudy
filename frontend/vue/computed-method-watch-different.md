#作用机制上
###1.watch和computed都是以Vue的依赖追踪机制为基础的，它们都试图处理这样一件事情：当某一个数据（称它为依赖数据）发生变化的时候，所有依赖这个数据的“相关”数据“自动”发生变化，也就是自动调用相关的函数去实现数据的变动。
###2.对methods:methods里面是用来定义函数的，很显然，它需要手动调用才能执行。而不像watch和computed那样，“自动执行”预先定义的函数
【总结】：methods里面定义的函数，是需要主动调用的，而和watch和computed相关的函数，会自动调用,完成我们希望完成的作用

#从性质上看
###1.methods里面定义的是函数，你显然需要像"fuc()"这样去调用它（假设函数为fuc）
###2.computed是计算属性，事实上和data对象里的数据属性是同一类的（使用上）,
例如：
```javascript
computed:{
    fullName: function () { return  this.firstName + lastName }
}
```
你在取用的时候，用this.fullName去取用，就和取data一样（不要当成函数调用！！）
###3.watch:类似于监听机制+事件机制
例如：
```javascript
watch: {
   firstName: function (val) {  this.fullName = val + this.lastName }
}
```
firstName的改变是这个特殊“事件”被触发的条件，而firstName对应的函数就相当于监听到事件发生后执行的方法

#watch和computed的对比

####1.watch擅长处理的场景：一个数据影响多个数据
####2.computed擅长处理的场景：一个数据受多个数据影响

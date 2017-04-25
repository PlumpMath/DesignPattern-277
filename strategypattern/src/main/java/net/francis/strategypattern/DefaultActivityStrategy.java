package net.francis.strategypattern;

/**
 * Created by Francis on 2017/4/8.
 *
 * 默认算法（注意这个，稍后的扩展阅读会说下这个Default实现的意义）
 *
 *
 *
 *
 */

        /*是因为这里我们用的这个DefaultActivityStrategy实际上也是一种设计模式的体现. 这个模式不在GoF的23中设计模式内, 但是绝对是一个很常用, 很实用的模式 --- 空对象模式.

        空对象模式（Null Object Pattern):
        用一个空(什么都不做的)对象来代替NULL.
        空对象模式是一个很简单的设计模式, 也可以看成是一种编码习惯. 它小但是作用大:

        使用空对象模式可以减少很多我们对于对象是否为空的判断. 例如本例中, 如果Checkstand的无参构造函数我们没有new一个空对象,
        那么后续的对于Checkstand实例各种调用我们可能就需要判断其mActivityStrategy是否为空. 如果遗漏, 很有可能导致null pointer异常.
        另外对于一些可以链式调用的对象, 如果我们要每次都判断是否为空会很影响我们的链式调用.
        空对象模式经常会用来作为策略模式算法族中的一个, 来提供空策略.*/

public class DefaultActivityStrategy implements ActivityStrategy {
    @Override
    public String getActivityPrice() {
        //什么都不做
        return "没有活动";
    }
}

package design.singleton;

/**
 * 枚举实现
 *
 * 这是单例模式的最佳实践，它实现简单，并且在面对复杂的序列化或者反射攻击的时候，能够防止实例化多次。
 *
 * 在用enum实现Singleton时介绍过三个特性，自由序列化，线程安全，保证单例。
 *
 * 我们都知道enum是由class实现的，换言之，enum可以实现很多class的内容，包括可以有member和member function，
 * 这也是我们可以用enum作为一个类来实现单例的基础。
 * 另外，由于enum是通过继承了Enum类实现的，enum结构不能够作为子类继承其他类，但是可以用来实现接口。
 * 此外，enum类也不能够被继承，在反编译中，我们会发现该类是final的。
 *
 * enum有且仅有private的构造器，防止外部的额外构造，这恰好和单例模式吻合，也为保证单例性做了一个铺垫。
 * 这里展开说下这个private构造器，如果我们不去手写构造器，则会有一个默认的空参构造器，我们也可以通过给枚举变量参量来实现类的初始化。
 *
 * @author lijunhao
 * @date 2018/07/04
 */
public enum Singleton {
    uniqueInstance
}

package oop.`object`.`class`

/**
 * Delegate
 *
 * @property base
 * @constructor Create empty Delegate
 *
 * Delegation Manual
 */
class Delegate(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

    override fun sayGoodBye(name: String) {
        base.sayGoodBye(name)
    }
}
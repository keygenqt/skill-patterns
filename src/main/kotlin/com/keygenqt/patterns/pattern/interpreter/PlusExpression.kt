package com.keygenqt.patterns.pattern.interpreter

// not terminal
class PlusExpression(private val left: Expression, private val right: Expression) : Expression {
    override fun interpret(): Int {
        return left.interpret() + right.interpret()
    }
}
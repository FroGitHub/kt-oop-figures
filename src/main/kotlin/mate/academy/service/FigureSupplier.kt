package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val ONE: Double = 1.0
private const val FIVE: Int = 5
private const val TEN: Double = 10.0

class FigureSupplier {

    private val colorSupplier = ColorSupplier()
    
    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIVE)) {
            0 -> Square(Random.nextDouble(ONE, TEN),
                colorSupplier.getRandomColor())
            1 -> Rectangle(Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN),
                colorSupplier.getRandomColor())
            2 -> RightTriangle(
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN),
                colorSupplier.getRandomColor()
            )
            3 -> Circle(Random.nextDouble(ONE, TEN),
                colorSupplier.getRandomColor())
            else -> IsoscelesTrapezoid(
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN),
                Random.nextDouble(ONE, TEN),
                colorSupplier.getRandomColor()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(TEN, Color.WHITE)
    }
}

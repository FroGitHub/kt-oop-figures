package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val supplier = FigureSupplier()

    val figures = Array(6) { i ->
        if (i < 3) supplier.getRandomFigure()
        else supplier.getDefaultFigure()
    }

    figures.forEach {
        it.draw()
    }
}

package mate.academy.model

class IsoscelesTrapezoid(
    val base1: Double,
    val base2: Double,
    val height: Double,
    override val color: Color
) : Figure {

    override fun getArea(): Double = (base1 + base2) * height / 2

    override fun draw() {
        println("Figure: trapezoid, area: ${getArea()} sq. units, " +
                "base1: $base1 units, base2: $base2 units, " +
                "height: $height units, color: $color")
    }
}

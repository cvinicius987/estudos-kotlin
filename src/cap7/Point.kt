package cap7

data class Point(val one:Int, val two:Int){
	
	operator fun plus(point:Point):Point{
		return Point(one + point.one, two + point.two)
	}
	
	operator fun times(scale:Double):Point{
		return Point((one * scale).toInt(), (two * scale).toInt())
	}
}

operator fun Point.minus(point:Point):Point{
	return Point(one - point.one, two - point.two)
}
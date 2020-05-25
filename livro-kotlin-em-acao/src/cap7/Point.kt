package cap7

data class Point(val x:Int, val y:Int) : Comparable<Point>{
	
	operator fun plus(point:Point):Point{
		return Point(x + point.x, y + point.y)
	}
	
	operator fun times(scale:Double):Point{
		return Point((x * scale).toInt(), (y * scale).toInt())
	}
	
	operator fun minus(point:Point):Point{
		return Point(x - point.x, y - point.y)
	}
	
	override fun compareTo(other:Point):Int{
		
		val sum 	 = this.x.compareTo(other.x)
		val sumOther = this.y.compareTo(other.y)
		
		return if(sum > 0 && sumOther > 0) sum
			   else if (sum == 0 && sumOther == 0) 0
			   else -1
	}
}
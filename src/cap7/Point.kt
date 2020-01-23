package cap7

data class Point(val one:Int, val two:Int) : Comparable<Point>{
	
	operator fun plus(point:Point):Point{
		return Point(one + point.one, two + point.two)
	}
	
	operator fun times(scale:Double):Point{
		return Point((one * scale).toInt(), (two * scale).toInt())
	}
	
	operator fun minus(point:Point):Point{
		return Point(one - point.one, two - point.two)
	}
	
	override fun compareTo(other:Point):Int{
		
		val sum 	 = this.one.compareTo(other.one)
		val sumOther = this.two.compareTo(other.two)
		
		return if(sum > 0 && sumOther > 0) sum
			   else if (sum == 0 && sumOther == 0) 0
			   else -1
	}
}
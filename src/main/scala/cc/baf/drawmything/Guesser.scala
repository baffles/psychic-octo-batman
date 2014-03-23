package cc.baf.drawmything

import scala.io.Source

object Guesser {
	def main(args: Array[String]) {
		val words = io.Source.fromInputStream(getClass.getResourceAsStream("/words.txt")).getLines.toList.distinct.groupBy(_.split(' ').toList.map(_.length))
		
		val lastArg = args.toList.takeRight(1)(0)
		
		val (wls, letters) = if (!Character.isDigit(lastArg(0))) args.toList.dropRight(1).map(_.toInt) -> lastArg.toList else args.toList.map(_.toInt) -> Nil

		for (words <- words.get(wls))
			println(words.filter({ word => letters.map(_.toString).forall(word.contains) }) mkString ", ")
	}
}